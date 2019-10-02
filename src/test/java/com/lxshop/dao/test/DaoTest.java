package com.lxshop.dao.test;

import com.lxshop.dao.UserMapper;
import com.lxshop.pojo.User;
import com.lxshop.test.TestBase;
import com.lxshop.dao.UserMapper;
import com.lxshop.pojo.User;
import com.lxshop.test.TestBase;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by geely on mmall.
 */
public class DaoTest extends TestBase {

    @Autowired
    private UserMapper userMapper;

    @Ignore
    @Test
    public void testDao(){
        User a = new User();
        a.setPassword("111");
        a.setUsername("aaaaageely");
        a.setRole(0);
        a.setCreateTime(new Date());
        a.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        System.out.println(userMapper.insert(a));
        System.out.println("aaaaaaaaaaaaaa");
    }


}
