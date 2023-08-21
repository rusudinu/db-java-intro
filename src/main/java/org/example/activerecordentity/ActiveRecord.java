package org.example.activerecordentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveRecord<T> {

    private Class<T> type;

    public void select() {
        ActiveRecordEntity entity = type.getAnnotation(ActiveRecordEntity.class);
        // TODO AFTER CREATING THE ANNOTATION, UNCOMMENT THE PIECE BELOW
        // System.out.println("SELECT * FROM " + entity.tableName());
    }

    public void update() {
        // TODO FILL IN MISSING CODE AND UNCOMMENT THE PIECE BELOW
        // System.out.println("UPDATE " + entity.tableName());
    }

    public void insert() {
        // TODO IMPLEMENT
    }

    public void delete() {
        // TODO IMPLEMENT
    }
}
