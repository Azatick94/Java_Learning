package learning_questions_answering.java_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main_GetSetParams {

    public static void main(String[] args) {

        // creating instance of the class
        ReflectionExample reflectionExample = new ReflectionExample();
        int number = reflectionExample.getNumber();

        // we need to get name parameter
        String name = null;


        // 1) Пытаюсь извлечь private параметр 'name'
        try {
            Field field = reflectionExample.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(reflectionExample);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("1) Name: " + name + ", number: " + number);

        // 2) Пытаюсь присвоить private параметру и потом извлечь в помощью рефлексии.
        // а теперь установим новое имя через Reflection и запринтуем новые данные.
        try {
            Field field = reflectionExample.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(reflectionExample, "New_name");
            name = (String) field.get(reflectionExample);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("2) Name: " + name + ", number: " + number);

        // 3) Пытаюсь вызвать private метод класса printInfo();
        try {
            Method method = reflectionExample.getClass().getDeclaredMethod("printInfo");
            method.setAccessible(true);

            System.out.print("3) Invoking hidden method: ");
            method.invoke(reflectionExample);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        // 4) Пытаюсь создать инстанс класса с default конструктором.
//        System.out.println(ReflectionExample.class.getName());

        ReflectionExample newInstance = null;

        try {
            Class<?> clazz = Class.forName(ReflectionExample.class.getName());

//            newInstance = (ReflectionExample)clazz.newInstance(); // old implementation
            newInstance = (ReflectionExample) clazz.getDeclaredConstructor().newInstance();
            System.out.println();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
