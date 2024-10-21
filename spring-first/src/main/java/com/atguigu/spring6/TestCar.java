package com.atguigu.spring6;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestCar {
    @Test
    public void test01() throws Exception {
        Class clazz = Car.class;
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor c : constructors){
            System.out.println("方法名称：" + c.getName() + "参数个数："+ c.getParameterCount());
        }
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println("方法名称：" + m.getName() + "返回类型：" + m.getReturnType() + "参数个数：" + m.getParameterCount());
        }
    }
}
