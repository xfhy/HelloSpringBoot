package com.xfhy.girl.utils;

import com.xfhy.girl.domain.Result;

/**
 * author xfhy
 * create at 2018/3/23 16:46
 * description： 专门用于简化返回数据的 不用每次都去手动封装数据
 */
public class ResultUtil {

    /**
     * 需要返回数据的 成功
     *
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 成功  但不用返回数据
     *
     * @return
     */
    public static Result success() {
        return success("");
    }

    /**
     * 失败  返回
     *
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        //如果失败 则传空字符串吧 如果是传null,那么客户端(json数据中没有)收不到该字段
        result.setData("");
        return result;
    }

}
