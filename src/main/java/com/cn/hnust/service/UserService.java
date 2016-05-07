/**
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cn.hnust.service;

import com.cn.hnust.domain.User;

/**
 * @author HuHui
 * @version $Id: UserService.java, v 0.1 2016-4-24 上午11:07:16 HuHui Exp $
 */
public interface UserService {

    User getUserById(Long id);
}
