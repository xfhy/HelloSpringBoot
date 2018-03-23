package com.xfhy.girl.handle;

import com.xfhy.girl.domain.Result;
import com.xfhy.girl.exception.GirlException;
import com.xfhy.girl.utils.ResultUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author xfhy
 * create at 2018/3/23 17:05
 * description：
 */
@ControllerAdvice  //注解定义全局异常处理类
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        //判断一下是不是自己定义的异常
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        } else {
            LOGGER.error("[系统异常] {}", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }

}
