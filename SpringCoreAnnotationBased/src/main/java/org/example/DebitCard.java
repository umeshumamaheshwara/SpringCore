package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("debitCard")
public class DebitCard implements  Payment{

    @Override
    public void pay() {
        System.out.println("Pay using DebitCard");
    }
}
