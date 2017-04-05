package com.skynet.dao;

import com.skynet.utils.ConfigConstant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Skynet on 2017/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class SysConfigDaoTest {

    @Autowired
    private SysConfigDao sysConfigDao;

    @Test
    public void queryByKey() throws Exception {
        String s = sysConfigDao.queryByKey(ConfigConstant.CLOUD_STORAGE_CONFIG_KEY);
        System.out.println(s);
    }

    @Test
    public void updateValueByKey() throws Exception {

    }

}