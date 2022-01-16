package lk.cinec;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain_10 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Primary primary = new Primary();

        Method method = primary.getClass().getDeclaredMethod("setX", double.class);
        method.setAccessible(true);
        method.invoke(primary, 76);
        System.out.println(primary);

    }
}
