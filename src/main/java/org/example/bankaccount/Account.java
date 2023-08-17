package org.example.bankaccount;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
public class Account {
    private int accountNo = -1;
    private double amount = 0;
    private int nationalId;

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(int amount) {
        if (this.amount < amount) {
            throw new NotEnoughMoneyException("Not enough money");
        }
        this.amount -= amount;
    }

    public void linkToNationalId(int nationalId) {
        if (!isNationalIdValid(nationalId)) {
            throw new InvalidNationalIdException("Invalid national id");
        }
        this.nationalId = nationalId;
    }

    private boolean isNationalIdValid(int nationalId) {
        return nationalId > 0;
    }
}
