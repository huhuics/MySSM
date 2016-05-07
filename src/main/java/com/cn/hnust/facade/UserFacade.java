/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package com.cn.hnust.facade;

import com.cn.hnust.domain.User;

/**
 * 对外提供User服务
 * @author HuHui
 * @version $Id: UserFacade.java, v 0.1 2016年5月2日 下午12:01:54 HuHui Exp $
 */
public interface UserFacade {

    /**
     * 通过id查询User对象
     * @param id
     * @return
     */
    User get(Long id);

}
