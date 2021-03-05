package tim_learning;

public class Learning_13_OOP_Static_Variable {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Doggy", 10);
        Dog dog2 = new Dog("Doggy2", 5);
        Dog dog3 = new Dog("Doggy3", 7);


        // in Dog Class I have created static Dog class variable.
        // Each time I instantiate Dog class, count variable increases by 1.
        // so, after 3 instantiations, Dog.count result should be equal to 3;
        System.out.println("Count of dogs: "+Dog.count);

        // also about static methods. The same way. THis is the method, which is not depended on instantiation.
        // every time i instantiate the dog instance, I call hello_message method.
        // lets try. we can directly call method from class Dog. Lets do it
        Dog.hello_message();


    }

}
