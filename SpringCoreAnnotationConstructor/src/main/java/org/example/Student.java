package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {

    @Value("1001")
    private Integer id;
    private String name;
    private Address address;

    public Student() {


    }

    public Student(Integer id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getter & Setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {   // required for Spring property injection
        this.id = id;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {   // required for Spring property injection
        this.name = name;
    }

    // Getter & Setter for address
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {   // required for Spring property injection
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
