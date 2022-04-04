package com.github.thecoolersuptelov.hw13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    @Qualifier("cart")
    Cart curCart;
    public void checkOutOrder(){
        curCart.soutCartProductList();
        curCart.totalSum();
    }
}
