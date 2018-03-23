package com.xfhy.girl.controller;

import com.xfhy.girl.properties.GirlProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author xfhy
 * create at 2018/3/23 8:43
 * description：
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    /**
     * `@Autowired`: byType方式。把配置好的Bean拿来用，完成属性、方法的组装，它可以对类成员变量、方法及构
     * 造函数进行标注，完成自动装配的工作。
     * 当加上（required=false）时，就算找不到bean也不报错。
     */
    @Autowired
    private GirlProperties girlProperties;

    // @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
//    @RequestMapping(value = "/say/{id}", method = RequestMethod.POST)
    //@RequestMapping(value = "/say", method = RequestMethod.POST)
    @PostMapping(value = "/say")
    public String hello(@RequestParam(value = "id", required = false, defaultValue = "0")
                                Integer id) {
        return "id:" + id;
    }

    /*
     * @PathVariable 获取url中的参数  /say/{id}
     *
     *                      //参数   是否必传          默认值
     * @RequestParam(value = "id", required = false, defaultValue = "0")
     * 获取hello/say?id=24  中的id参数
     *
     * @RequestMapping(value = "/say", method = RequestMethod.POST)  两者相同的
        @PostMapping(value = "/say")
     * */

}
