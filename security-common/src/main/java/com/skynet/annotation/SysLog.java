package com.skynet.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * Created by Skynet on 2017/4/3.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
