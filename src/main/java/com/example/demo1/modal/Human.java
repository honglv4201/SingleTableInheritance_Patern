package com.example.demo1.modal;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "human_type",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String address;
    private String phoneNumber;


    public Human() {
    }

    public Human(String name, String email, String address, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
