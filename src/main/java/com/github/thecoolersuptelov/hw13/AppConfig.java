package com.github.thecoolersuptelov.hw13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.thecoolersuptelov.hw13")
public class AppConfig {
    @Bean
    public static Product product(){
        Product product = new Product();
        product.setTitle("Product #" + Math.random());
        product.cost = (float)Math.random();
        return product;
    }
    @Bean
    public ProductService productService(){
        return new ProductService();
    }
    @Bean
    public Cart cart(){
        return new Cart();
    }
    @Bean
    public OrderService orderService(){
        return new OrderService();
    }

}
