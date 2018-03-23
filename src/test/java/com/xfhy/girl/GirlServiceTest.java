package com.xfhy.girl;

import com.xfhy.girl.domain.Girl;
import com.xfhy.girl.service.GirlService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author xfhy
 * create at 2018/3/23 17:53
 * description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest() {
        Girl girl = girlService.findOneGirl(6);
        Assert.assertEquals(new Integer(18), girl.getAge());
    }

}
