package tim_learning;

public class Cat extends Dog {

    // cat inherits name nad age attributes. And also has weight attribute which is unique only to cat;
    private double weight;

    public Cat(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public Cat(String name) {
        super(name, 1);
        this.weight = 10;

    }



    public void cat_bark() {
        System.out.println("Cat Meyouh !!!");
    }



}
