package com.xfhy.girl.exception;

import com.xfhy.girl.enums.ResultEnum;

/**
 * author xfhy
 * create at 2018/3/23 17:13
 * description：  自定义的异常  多了个code   方便到时候查找
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
