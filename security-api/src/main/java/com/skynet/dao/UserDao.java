package com.skynet.dao;


import com.skynet.entity.UserEntity;

/**
 * 用户
 * 
 * Created by Skynet on 2017/4/4.
 */
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
