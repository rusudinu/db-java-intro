package org.example.dogshelter;

import lombok.Data;

import java.util.Date;

@Data
public class Account {
    private int id;
    private String iban;
    private double amount;
    private Date createdOn;
    private double interest;

    public void deposit(double amount) {
        // TODO implement
    }

    public void withdraw(double amount) {
        // TODO implement
    }
}
