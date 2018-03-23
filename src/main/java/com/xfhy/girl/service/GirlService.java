package com.xfhy.girl.service;

import com.xfhy.girl.domain.Girl;
import com.xfhy.girl.repository.GirlRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * author xfhy
 * create at 2018/3/23 14:37
 * description：
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(12);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("F");
        girlB.setAge(16);
        girlRepository.save(girlB);
    }

    public Girl findOneGirl(Integer id) {
        Optional<Girl> girl = girlRepository.findById(id);
        return girl.get();
    }

}
