package com.skynet.dao;


import com.skynet.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 * 
 * Created by Skynet on 2017/4/4.
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
