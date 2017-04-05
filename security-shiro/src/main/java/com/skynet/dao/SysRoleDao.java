package com.skynet.dao;


import com.skynet.entity.SysRoleEntity;

import java.util.List;

/**
 * 角色管理
 * 
 * Created by Skynet on 2017/4/4.
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
