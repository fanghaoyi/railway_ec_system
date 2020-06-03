package com.railway.railwayecsystem.controller;


import com.railway.railwayecsystem.model.DsUser;
import com.railway.railwayecsystem.service.DsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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
