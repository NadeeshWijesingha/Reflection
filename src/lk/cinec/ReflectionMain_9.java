package lk.cinec;

import java.lang.reflect.Method;

public class ReflectionMain_9 {
    public static void main(String[] args) throws IllegalAccessException {

        Primary primary = new Primary();

        Method[] methods = primary.getClass().getMethods();
        System.out.println("Method Count : " + methods.length);
        System.out.println();

        for (Method method: methods) {
            System.out.println("Method Name : " + method.getName());
            System.out.println("Method Type : " + method.getReturnType());

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class cls: parameterTypes) {
                System.out.println("Method Parameters : " + cls.getName());
            }
            System.out.println();
        }

    }
}
