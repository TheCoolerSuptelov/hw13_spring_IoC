package com.github.thecoolersuptelov.hw13;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class ProductService implements BeanPostProcessor {

    ArrayList<Product> productList;

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void printAllProducts() {
        System.out.println(productList.stream().map(Product::getTitle).collect(Collectors.joining(" ,")));
    }
    public void addToProductList(Product product){
        productList.add(product);
    }
    public void getTotalSum(){
        System.out.println("Total order amount" +
                    productList.stream().map(Product::getCost).reduce(0f, Float::sum));
    }
    public Product findByTitle(String title) {
        return productList.stream().filter(product -> product.getTitle().equals(title)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("value not found"));
        //for(Product productFromList:productList){
        //    if (title.equals(productFromList.getTitle())){
        //        return productFromList;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        for (int i = 0; i < 10; i++) {
            this.productList.add(AppConfig.product());
        }
        return this;
    }
}
