package com.keerthi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            //com.keerthi.Vehicle obj = context.getBean("vehicle", com.keerthi.Vehicle.class);
            //Vehicle obj = (Vehicle) context.getBean("bike");
            //obj.drive();
            Tyre obj = (Tyre) context.getBean("tyre");
            System.out.println(obj);
        }
    }
}
