package org.example.annotations;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet("Tom", 3);
        Pet anotherPet = new Pet("Jerry", 20);
        try {
            logFields(pet);
            logFields(anotherPet);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logFields(Object obj) throws IllegalAccessException {
        Class<?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(LogField.class)) {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(obj));
            }
            if (field.isAnnotationPresent(LogConditional.class)) {
                field.setAccessible(true);
                LogConditional annotation = field.getAnnotation(LogConditional.class);
                int value = annotation.value();
                int fieldValue = field.getInt(obj);
                if (fieldValue < value) {
                    System.out.println(field.getName() + ": " + fieldValue);
                }
            }
        }
    }
}
