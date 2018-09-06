package util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtil {


    public static void getAllField(Class clas) {
        System.out.println("***********this is all fields**********");
        Field[] declaredFields = clas.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.toString());
        }
    }

    public static void getAllConstruct(Class clas) {
        System.out.println("***********this is all constructs**********");

        Constructor[] declaredConstructors = clas.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.toString());
        }
    }

    public static void getAllMethod(Class clas) {
        System.out.println("***********this is all methods**********");
        Method[] methods = clas.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }
    }

    public static Object newInstance(Class clas, Object... objects) throws Exception {
        Constructor[] constructors = clas.getDeclaredConstructors();
        for (Constructor constructor : constructors)
            if (constructor.getParameterCount() == objects.length) {
                //声明为private的需要setAccessible
                constructor.setAccessible(true);
                return constructor.newInstance(objects);
            }
        return null;
    }

    public static void invoke(Object object, String methodName, String params) throws Exception {
        Class<?> clas = object.getClass();
        Method method = clas.getMethod(methodName, params.getClass());
        if (method != null) {
            method.invoke(object, params);
        }
    }
}
