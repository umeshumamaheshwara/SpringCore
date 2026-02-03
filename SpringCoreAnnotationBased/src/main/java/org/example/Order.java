package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

    @Autowired
    Payment payment;

    public void amountPay(double amount){
        System.out.println("The amount is :" + amount);
        payment.pay();

    }
}
