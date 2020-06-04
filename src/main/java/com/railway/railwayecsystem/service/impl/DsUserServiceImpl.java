package com.railway.railwayecsystem.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.railway.railwayecsystem.mapper.DsUserMapper;
import com.railway.railwayecsystem.model.DsUser;
import com.railway.railwayecsystem.service.DsUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * create :fanghaoyi
 * date: 2020/6/3
 * describe: 描述
 */
@Service(value = "dsUserService")
public class DsUserServiceImpl implements DsUserService {

	@Resource
	private DsUserMapper dsUserMapper;//这里会报错，但是并不会影响

	public int addUser(DsUser user) {
		int insert = dsUserMapper.insert(user);
		return insert;

	}

	/*
	 * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
	 * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
	 * pageNum 开始页数
	 * pageSize 每页显示的数据条数
	 * */
	public PageInfo<DsUser> findAllUser(int pageNum, int pageSize) {
		//将参数传给这个方法就可以实现物理分页了，非常简单。
		PageHelper.startPage(pageNum, pageSize);
		List<DsUser> userDomains = dsUserMapper.selectUsers();
		PageInfo result = new PageInfo(userDomains);
		return result;
	}

	@Override
	public List<DsUser> find(DsUser dsUser) {
		return dsUserMapper.find(dsUser);
	}

}
