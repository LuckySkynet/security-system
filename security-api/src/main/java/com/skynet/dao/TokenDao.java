package com.skynet.dao;


import com.skynet.entity.TokenEntity;

/**
 * 用户Token
 * 
 * Created by Skynet on 2017/4/4.
 */
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
