package com.skynet.service;

import java.util.List;


/**
 * 角色与菜单对应关系
 *
 * Created by Skynet on 2017/4/4.
 */
public interface SysRoleMenuService {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
	
}
