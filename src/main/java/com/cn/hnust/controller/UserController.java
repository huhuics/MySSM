/**
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.domain.User;
import com.cn.hnust.service.UserService;

/**
 * @author HuHui
 * @version $Id: UserController.java, v 0.1 2016-4-24 下午1:45:13 HuHui Exp $
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        Long id = Long.parseLong(request.getParameter("id"));
        User user = userService.getUserById(id);
        model.addAttribute("user", user);

        return "showUser";
    }

}
