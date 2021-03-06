package com.skynet.xss;

import com.skynet.utils.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * SQL过滤
 * <p>
 * Created by Skynet on 2017/4/3.
 */
public class SQLFilter {

    public static String sqlInject(String str) {
        if (StringUtils.isBlank(str)) {
            return null;
        }

        //去掉'|"|;|\字符
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");

        //转换成小写
        str = str.toLowerCase();

        //非法字符
        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alert", "create", "drop"};

        //判断是否包含非法字符
        for (String keyword : keywords) {
            if (str.contains(keyword)) {
                throw new RRException("包含非法字符");
            }
        }

        return str;
    }

}
