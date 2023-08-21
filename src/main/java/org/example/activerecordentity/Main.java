package org.example.activerecordentity;

public class Main {
    public static void main(String[] args) {
        ActiveRecord<Customer> customerRecord = new ActiveRecord<>(Customer.class);
        customerRecord.select();
        customerRecord.update();
        customerRecord.insert();
        customerRecord.delete();
    }
}
