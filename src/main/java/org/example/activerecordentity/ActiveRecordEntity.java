package org.example.activerecordentity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // can use in class only.
public @interface ActiveRecordEntity {

    public String tableName();

    public String primaryKey();
}
