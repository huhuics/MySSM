/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package com.cn.mytest;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.domain.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 测试Mybatis的分页插件
 * @author HuHui
 * @version $Id: TestPagingHelper.java, v 0.1 2016年5月10日 下午10:06:01 HuHui Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class TestPagingHelper {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testPaging() {
        PageHelper.startPage(1, 10);
        List<User> users = userMapper.selectUsers();
        PageInfo<User> page = new PageInfo<User>(users);
        Assert.assertEquals(1, page.getPageNum());
        Assert.assertEquals(10, page.getPageSize());
        Assert.assertEquals(1, page.getStartRow());
        Assert.assertEquals(10, page.getEndRow());
        Assert.assertEquals(37, page.getTotal());
        Assert.assertEquals(4, page.getPages());
        Assert.assertEquals(1, page.getFirstPage());
        Assert.assertEquals(4, page.getLastPage());
        Assert.assertEquals(true, page.isIsFirstPage());
        Assert.assertEquals(false, page.isIsLastPage());
        Assert.assertEquals(false, page.isHasPreviousPage());
        Assert.assertEquals(true, page.isHasNextPage());
    }
}
