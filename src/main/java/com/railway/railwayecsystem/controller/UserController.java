package com.railway.railwayecsystem.controller;


import com.railway.railwayecsystem.dto.FunctionParent;
import com.railway.railwayecsystem.model.DsUser;
import com.railway.railwayecsystem.service.DsUserService;
import com.railway.railwayecsystem.util.Config;
import com.railway.railwayecsystem.util.ResultDtoUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * create :fanghaoyi
 * date: 2020/6/3
 * describe: 描述
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private DsUserService dsUserService;

	@ResponseBody
	@PostMapping("/login")
	public String login(DsUser user){
		if(StringUtils.isBlank(user.getLogonName())){
			return ResultDtoUtils.returnFeil("请输入账号");
		}
		if(StringUtils.isBlank(user.getPassword())){
			return ResultDtoUtils.returnFeil("请输入密码");
		}
		List<DsUser> dsUsers = dsUserService.find(user);
		if(dsUsers==null||dsUsers.size()==0){
			return ResultDtoUtils.returnFeil("账号或密码不正确");
		}
		user=dsUsers.get(0);
		user.setPassword(null);
		return ResultDtoUtils.returnSuccess(user);
	}

	@ResponseBody
	@PostMapping("/function")
	public String function(DsUser user){
		List<FunctionParent> function = dsUserService.findFunction(user);
		return ResultDtoUtils.returnSuccess(function);
	}






	@ResponseBody
	@PostMapping("/add")
	public int addUser(DsUser user){
		return dsUserService.addUser(user);
	}

	@ResponseBody
	@GetMapping("/all")
	public Object findAllUser(
		@RequestParam(name = "pageNum", required = false, defaultValue = "1")
			int pageNum,
		@RequestParam(name = "pageSize", required = false, defaultValue = "10")
			int pageSize){
		return dsUserService.findAllUser(pageNum,pageSize);
	}

}
