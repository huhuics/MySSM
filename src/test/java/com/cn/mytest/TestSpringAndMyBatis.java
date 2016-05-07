package com.cn.mytest;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.domain.User;
import com.cn.hnust.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class TestSpringAndMyBatis {

    private static final Logger logger = LoggerFactory.getLogger(TestSpringAndMyBatis.class);

    @Resource
    private UserService         userService;

    @Test
    public void testUserService() {
        User user = userService.getUserById(1L);
        assertNotNull(user);
        logger.info("user --> {}", JSON.toJSONString(user));
        logger.error("参数错误{}", user);
        logger.warn("这是一个警告");
    }

}
