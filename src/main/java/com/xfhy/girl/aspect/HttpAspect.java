package com.xfhy.girl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * author xfhy
 * create at 2018/3/23 15:41
 * description：  AOP 面向切面
 */
@Aspect
@Component
public class HttpAspect {

    //打印日志的
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    //需要切的点    直接在这里定义了,免得多次写
    @Pointcut("execution(public * com.xfhy.girl.controller.GirlController.*(..))")
    public void log() {
    }

    //.* 所有方法
    @Before("log()")
    public void doBefore() {
        LOGGER.info("卧槽,,,,,,我被在方法之前被执行了");
    }

    @After("log()")
    public void doAfter() {
        LOGGER.info("卧槽,,,,,,我被在方法之后被执行了");
    }

}
