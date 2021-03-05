package tim_learning;

/**
 * 2 parameters
 * 1) name - String;
 * 2) age - int;
 */
public class Dog {

    // static mean that it is not connected with each instance. This variable is connected with whole Class.
    protected static int count = 0;
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        // when object will be instantiated, count will be increased by 1;
        Dog.count+=1;
        Dog.hello_message();
    }

    public static void hello_message() {
        System.out.println("Hi!!! I am a dog!!! Whofff !!!");
    }

    public void print_dog_info() {
        System.out.println("Dog name is: " + this.name);
        System.out.println("Dog age is: " + this.age);
    }

    public void dog_bark() {
        System.out.println("Bark! Bark! Bark!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name of Dog is Changed. New name of the Dog is: " + this.name );
    }

    public int getAge() {
        return this.age;
    }


}


