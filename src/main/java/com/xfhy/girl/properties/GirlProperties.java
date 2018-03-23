package com.xfhy.girl.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * author xfhy
 * create at 2018/3/23 9:50
 * description：
 */
@Component   //注册容器bean
@ConfigurationProperties(prefix = "girl")   //对应配置文件中的一个节点
public class GirlProperties {
    private String cupSize;
    private int age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
