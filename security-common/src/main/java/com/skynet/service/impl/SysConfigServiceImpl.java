package com.skynet.service.impl;

import com.alibaba.fastjson.JSON;
import com.skynet.dao.SysConfigDao;
import com.skynet.entity.SysConfigEntity;
import com.skynet.service.SysConfigService;
import com.skynet.utils.RRException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Skynet on 2017/4/3.
 */
@Service("sysConfigService")
public class SysConfigServiceImpl implements SysConfigService{

    @Autowired
    private SysConfigDao sysConfigDao;

    @Override
    public void save(SysConfigEntity sysConfig) {
        sysConfigDao.save(sysConfig);
    }

    @Override
    public void update(SysConfigEntity sysConfig) {
        sysConfigDao.update(sysConfig);
    }

    @Override
    public void updateValueByKey(String key, String value) {
        sysConfigDao.updateValueByKey(key, value);
    }

    @Override
    public void deleteBatch(Long[] ids) {
        sysConfigDao.deleteBatch(ids);
    }

    @Override
    public List<SysConfigEntity> queryList(Map<String, Object> map) {
        return sysConfigDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysConfigDao.queryTotal(map);
    }

    @Override
    public SysConfigEntity queryObject(Long id) {
        return sysConfigDao.queryObject(id);
    }

    @Override
    public String getValue(String key, String defaultValue) {
        String value = sysConfigDao.queryByKey(key);
        if(StringUtils.isBlank(value)){
            return defaultValue;
        }
        return value;
    }

    @Override
    public <T> T getConfigObject(String key, Class<T> clazz) {
        String value = getValue(key, null);
        if (StringUtils.isNotBlank(value)) {
            return JSON.parseObject(value, clazz);
        }
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RRException("获取参数失败");
        }
    }
}
