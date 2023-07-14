package com.turing.javase4thbatch.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface NotNull {
    String message() default "Field should not be null";
}
class Human {
    @NotNull(message = "Human name should not be null")
    String name;

    String address;
}

class Animal {
    @NotNull(message = "Animal name should not be null")
    String name;
    @NotNull
    String place;
}

class Validator {
    static void validate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field name -> "+ field.getName());
            System.out.println("Field type -> "+ field.getType());

            NotNull notNull = field.getAnnotation(NotNull.class);
            if(notNull != null) {
                try {
                    Object value = field.get(obj);
                    if(value == null) {
                        System.err.println("Field "+field.getName()+" is null "+notNull.message());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("-------------------------------");
        }
    }
}
public class ValidationAnnotation {
    public static void main(String[] args) {
        Human someone =  new Human();
        // someone.name = "";

        Validator.validate(someone);

        Animal cat = new Animal();
        Validator.validate(cat);
    }
}
