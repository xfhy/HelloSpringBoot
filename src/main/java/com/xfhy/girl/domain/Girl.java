package com.xfhy.girl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * author xfhy
 * create at 2018/3/23 12:21
 * description：
 */
@Entity
public class Girl {

    @Id     //导入时认准:javax.persistence.Id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //id且自增
    private Integer id;
    private String cupSize;

    @Min(value = 18, message = "未成年少女禁止入内")   //限制  最小18
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
