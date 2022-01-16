package lk.cinec;

import java.lang.reflect.Field;

public class ReflectionMain_7 {
    public static void main(String[] args) throws IllegalAccessException {

        Primary primary = new Primary();

        Field[] declaredFields = primary.getClass().getDeclaredFields();
        System.out.println("field count : " + declaredFields.length);
        System.out.println();

        for (Field field: declaredFields) {
            field.setAccessible(true);
            System.out.println("Field Name : " + field.getName());
            System.out.println("Type : " + field.getType());
            System.out.println("Value : " + field.getDouble(primary));
            System.out.println();
        }

    }
}
