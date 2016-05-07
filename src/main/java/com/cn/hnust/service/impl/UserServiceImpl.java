/**
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.domain.User;
import com.cn.hnust.service.UserService;

/**
 * @author HuHui
 * @version $Id: UserServiceImpl.java, v 0.1 2016-4-24 上午11:08:33 HuHui Exp $
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper          userMapper;

    @Override
    public User getUserById(Long id) {
        logger.info("收到查询用户参数,id={}", id);
        User user = null;
        try {
            user = userMapper.selectByPrimaryKey(id);
            //            throw new RuntimeException("抛出一个RuntimeException");
        } catch (Exception e) {
            logger.error("查询用户捕获异常,查询参数id={},user={}", id, JSON.toJSONString(user), e);
        }
        logger.info("查询用户结果:{}", JSON.toJSONString(user));
        return user;
    }
}
