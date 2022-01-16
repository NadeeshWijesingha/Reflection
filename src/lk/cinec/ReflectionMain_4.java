package lk.cinec;

import java.lang.reflect.Field;

public class ReflectionMain_4 {
    public static void main(String[] args) throws IllegalAccessException {

        Primary primary = new Primary();

        Field[] fields = primary.getClass().getFields();
        System.out.println("field count : " + fields.length);

        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getDouble(primary));
            System.out.println("-----------------------");
        }

    }
}
