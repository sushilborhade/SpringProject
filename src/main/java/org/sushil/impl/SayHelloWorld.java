package org.sushil.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sushil.beans.HelloWorld;

/**
 * Created by sushilpborhade on 27/05/16.
 */
public class SayHelloWorld {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        System.out.println(helloWorld.sayHello());
    }
}
