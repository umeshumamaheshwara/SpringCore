package org.example;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city;

    public Address() {

    }

    public Address(String city) {
        this.city = city;
    }

    // Getter & Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {   // required for Spring property injection
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
