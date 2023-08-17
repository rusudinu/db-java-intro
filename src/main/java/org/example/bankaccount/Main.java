package org.example.bankaccount;

public class Main {
    public static void main(String[] args) {
        Account bankAccount = new Account();
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        System.out.println(bankAccount);
        bankAccount.linkToNationalId(2);
        try {
            bankAccount.linkToNationalId(-1);
        } catch (InvalidNationalIdException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankAccount.withdraw(1000);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
