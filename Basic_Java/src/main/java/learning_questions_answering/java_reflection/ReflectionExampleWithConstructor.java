package learning_questions_answering.java_reflection;

public class ReflectionExampleWithConstructor {
    private int number = 10;
    private String name = "Stepa";

    public ReflectionExampleWithConstructor(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // get name will be skipped, we will explore name parameter via Java Reflection
    public void setName(String name) {
        this.name = name;
    }

    // printInfo спрятан
    private void printInfo() {
        System.out.println("Name: "+this.name+", number: "+this.number);
    }


}
