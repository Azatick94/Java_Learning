package tim_learning;


public class Learning_11_OOP_Dog_Class {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Doggy", 3);
        dog1.print_dog_info();
        dog1.dog_bark();
        // getting params of dog;
        String name = dog1.getName();
        System.out.println("Dog name is: " + name);
        // changing dog name
        dog1.setName("Doggy_new");

    }
}
