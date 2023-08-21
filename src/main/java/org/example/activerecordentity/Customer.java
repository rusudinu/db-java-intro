package org.example.activerecordentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ActiveRecordEntity(tableName = "customers", primaryKey = "customerId")
public class Customer {
    private String name;
    private int age;
}
