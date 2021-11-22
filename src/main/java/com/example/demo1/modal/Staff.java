package com.example.demo1.modal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "Staff")
public class Staff extends Human {
    @Enumerated(value = EnumType.STRING)
    private Degree degree;

    private Integer experience;


    public Staff() {
    }

    public Staff(String name, String email, String address, String phoneNumber, Degree degree, Integer experience) {
        super(name, email, address, phoneNumber);
        this.degree = degree;
        this.experience = experience;
    }
}
