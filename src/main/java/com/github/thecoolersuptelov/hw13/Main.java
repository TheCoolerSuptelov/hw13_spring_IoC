package com.github.thecoolersuptelov.hw13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService curOrderService = context.getBean(OrderService.class);
        curOrderService.checkOutOrder();
    }
}
