package com.turing.javase4thbatch.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String message();
}
class AnnoTestClass {

    @MyAnno(message = "Hello World")
    void method() {
        System.out.println("method");
    }

    void another(String msg)
    {
        System.out.println("Another method");
    }
}
public class CustomAnnotaion {
    public static void main(String[] args) {
        AnnoTestClass obj = new AnnoTestClass();

        Class clazz = obj.getClass();
        System.out.println("ClassName "+clazz.getName());

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("Method Name -> "+ method.getName());
        }
        System.out.println("========================================");

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("Declared Method Name -> "+ method.getName());
            System.out.println("Declared Method Return Type -> "+ method.getReturnType());
            Class<?>[] parameters = method.getParameterTypes();
            for (Class<?> parameter: parameters) {
                System.out.println("Declared Method Signature Type -> "+ parameter.getName());
            }
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("Annotation -> "+ annotation);
                if (annotation instanceof MyAnno tempAnnotation) {
                    System.out.println("Data Message -> "+tempAnnotation.message());
                }
                /* same if block
                if (annotation instanceof MyAnno) {
                    MyAnno temp = (MyAnno) annotation;
                    System.out.println("Data(temp) Message -> "+ temp.message());
                }
                */
            }
            MyAnno temp = method.getAnnotation(MyAnno.class);
            System.out.println("Get Annotation -> "+ temp );
            System.out.println("-------------------------------");
        }
    }
}
