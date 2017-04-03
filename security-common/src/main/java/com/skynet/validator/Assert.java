package com.skynet.validator;

import com.skynet.utils.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * Created by Skynet on 2017/4/3.
 */
public class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }

}
