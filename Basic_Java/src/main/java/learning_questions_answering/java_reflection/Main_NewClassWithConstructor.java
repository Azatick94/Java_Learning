package learning_questions_answering.java_reflection;

import java.lang.reflect.InvocationTargetException;

public class Main_NewClassWithConstructor {

    public static void main(String[] args) {

        ReflectionExampleWithConstructor reflectionExampleWithConstructor;

        try {
            Class<?> clazz =  Class.forName(ReflectionExampleWithConstructor.class.getName());
            Class<?>[] params = {int.class, String.class};
            reflectionExampleWithConstructor = (ReflectionExampleWithConstructor) clazz.getDeclaredConstructor(params).newInstance(1, "default2");
            System.out.println(reflectionExampleWithConstructor.toString());


        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
