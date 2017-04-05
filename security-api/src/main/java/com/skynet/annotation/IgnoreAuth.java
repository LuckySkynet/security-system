package com.skynet.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token验证
 *
 * Created by Skynet on 2017/4/4.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {

}