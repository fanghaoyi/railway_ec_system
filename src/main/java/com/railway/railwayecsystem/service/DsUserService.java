package com.railway.railwayecsystem.service;

import com.github.pagehelper.PageInfo;
import com.railway.railwayecsystem.model.DsUser;

/**
 * create :fanghaoyi
 * date: 2020/6/3
 * describe: 描述
 */
public interface DsUserService {

	int addUser(DsUser user);

	PageInfo<DsUser> findAllUser(int pageNum, int pageSize);

}
