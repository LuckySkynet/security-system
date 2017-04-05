package com.skynet.service;


import com.skynet.entity.TokenEntity;

import java.util.Map;

/**
 * 用户Token
 * 
 * Created by Skynet on 2017/4/4.
 */
public interface TokenService {

	TokenEntity queryByUserId(Long userId);

	TokenEntity queryByToken(String token);
	
	void save(TokenEntity token);
	
	void update(TokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 * @return        返回token相关信息
	 */
	Map<String, Object> createToken(long userId);

}
