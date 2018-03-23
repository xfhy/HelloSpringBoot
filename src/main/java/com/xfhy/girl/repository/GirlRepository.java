package com.xfhy.girl.repository;

import com.xfhy.girl.domain.Girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * author xfhy
 * create at 2018/3/23 12:33
 * description：
 */

//继承JpaRepository  bean类名,id类型
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    List<Girl> findByAge(Integer age);   //findBy 属性名  这里的名字不能随便写

}
