package com.github.thecoolersuptelov.hw13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cart {
    @Autowired
    @Qualifier("productService")
    ProductService cartProductList;
    public void addToCart(Product curProduct){
        cartProductList.addToProductList(curProduct);
    }
    public void soutCartProductList(){
        cartProductList.printAllProducts();
    }
    public void totalSum(){
        cartProductList.getTotalSum();
    }
}
