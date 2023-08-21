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
        System.out.println("SELECT * FROM " + entity.tableName());
    }

    public void update() {
        ActiveRecordEntity entity = type.getAnnotation(ActiveRecordEntity.class);
        System.out.println("UPDATE " + entity.tableName());
    }

    public void insert() {
        ActiveRecordEntity entity = type.getAnnotation(ActiveRecordEntity.class);
        System.out.println("INSERT INTO " + entity.tableName());
    }

    public void delete() {
        ActiveRecordEntity entity = type.getAnnotation(ActiveRecordEntity.class);
        System.out.println("DELETE FROM " + entity.tableName());
    }
}
