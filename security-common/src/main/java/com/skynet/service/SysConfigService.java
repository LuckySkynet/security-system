package com.skynet.service;

import com.skynet.entity.SysConfigEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统配置信息
 *
 * Created by Skynet on 2017/4/3.
 */
public interface SysConfigService {

    /**
     * 保存配置信息
     *
     * @param sysConfig
     */
    void save(SysConfigEntity sysConfig);

    /**
     * 更新配置信息
     *
     * @param sysConfig
     */
    void update(SysConfigEntity sysConfig);

    /**
     * 根据key，更新value
     *
     * @param key
     * @param value
     */
    void updateValueByKey(String key, String value);

    /**
     * 批量删除配置信息
     *
     * @param ids
     */
    void deleteBatch(Long[] ids);

    /**
     * 获取List列表
     *
     * @param map
     * @return
     */
    List<SysConfigEntity> queryList(Map<String, Object> map);

    /**
     * 获取总记录数
     *
     * @param map
     * @return
     */
    int queryTotal(Map<String, Object> map);

    SysConfigEntity queryObject(Long id);

    /**
     * 根据key，获取配置的value值
     *
     * @param key
     * @param defaultValue
     * @return
     */
    String getValue(String key, String defaultValue);

    /**
     * 根据key，获取value的Object对象
     *
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T getConfigObject(String key, Class<T> clazz);


}
