package org.example.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @LogField
    private String name;
    @LogConditional(5)
    private int age;
}
