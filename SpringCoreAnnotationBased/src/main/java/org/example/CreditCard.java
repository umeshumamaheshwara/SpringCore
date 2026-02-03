package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("creditCard")
public class CreditCard implements  Payment {
    @Override
    public void pay() {
        System.out.println("pay using credit");
    }
}
