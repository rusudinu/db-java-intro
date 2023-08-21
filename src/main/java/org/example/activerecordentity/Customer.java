package org.example.activerecordentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// TODO ADD THE ANNOTATION
public class Customer {
    private String name;
    private int age;
}
