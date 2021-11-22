package com.example.demo1.modal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "Customer")
public class Customer extends Human {
    @Enumerated(value = EnumType.STRING)
    private Grade grade;
    private Integer loyalty;

    public Customer() {
    }

    public Customer(String name, String email, String address, String phoneNumber, Grade grade, Integer loyalty) {
        super(name, email, address, phoneNumber);
        this.grade = grade;
        this.loyalty = loyalty;
    }
}
