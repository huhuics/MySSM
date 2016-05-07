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
import com.cn.hnust.facade.UserFacade;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class TestUserFacade {

    private static final Logger logger = LoggerFactory.getLogger(TestUserFacade.class);

    @Resource
    private UserFacade          userFacade;

    @Test
    public void testUserService() {
        User user = userFacade.get(1L);
        logger.info("测试User查询结果:{}" + JSON.toJSONString(user));
        assertNotNull(user);
    }

}
