package com.xfhy.girl.enums;

/**
 * author xfhy
 * create at 2018/3/23 17:34
 * description： 统一一下错误的枚举,以免错乱.  所有的错误码,全放在这里.
 * <p>
 * 优雅的编码
 */
public enum ResultEnum {
    UNKONWED_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    ERROR(1, "失败");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
