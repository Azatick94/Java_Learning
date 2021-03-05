package tim_learning;


public class Learning_12_OOP_Inheritance {

    public static void main(String[] args) {

        // creating cat object
        Cat cat = new Cat("Catty", 4, 15);
        System.out.println("Age is: " + cat.getAge());
        cat.cat_bark();

        // creating cat object another way
        Cat cat2 = new Cat("Catty2");
        System.out.println("Age is: " + cat2.getAge());
        cat2.cat_bark();



    }
}
