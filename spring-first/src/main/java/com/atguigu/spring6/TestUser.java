package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUserObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
        logger.info("执行调用成功");//测试5测试
    }
    @Test
    public void testUserObject1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.atguigu.spring6.User");
        User user = (User)clazz.newInstance();
    }
}
