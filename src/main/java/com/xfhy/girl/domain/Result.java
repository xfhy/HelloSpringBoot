package com.xfhy.girl.domain;

/**
 * author xfhy
 * create at 2018/3/23 16:34
 * description：http请求的最外层对象
 */
public class Result<T> {

    /**
     * 状态码  0:成功   1:失败
     */
    private Integer code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
