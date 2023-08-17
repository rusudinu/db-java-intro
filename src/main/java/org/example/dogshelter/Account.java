package org.example.dogshelter;

import lombok.Data;
import org.example.bankaccount.NotEnoughMoneyException;

import java.util.Date;

@Data
public class Account {
    private int id;
    private String iban;
    private double amount;
    private Date createdOn;
    private double interest;

    public void deposit(double amount) {
        this.amount += amount;
    }

    public void withdraw(double amount) {
        if (this.amount < amount) {
            throw new NotEnoughMoneyException("Not enough money");
        }
        this.amount -= amount;
    }
}
