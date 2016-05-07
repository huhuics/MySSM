/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package com.cn.hnust.facade;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cn.hnust.domain.User;
import com.cn.hnust.service.UserService;

/**
 * 
 * @author HuHui
 * @version $Id: UserFacadeImpl.java, v 0.1 2016年5月2日 下午12:02:39 HuHui Exp $
 */
@Service
@WebService
public class UserFacadeImpl implements UserFacade {

    /** 日志 */
    private static final Logger logger = LoggerFactory.getLogger(UserFacadeImpl.class);

    @Resource
    private UserService         userService;

    @Override
    public User get(Long id) {
        logger.info("收到User查询条件:{}", id);
        User user = userService.getUserById(id);
        return user;
    }

    @WebMethod(exclude = true)
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
