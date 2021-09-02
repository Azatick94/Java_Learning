package learning_questions_answering.java_patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {

        // sample shape
        AbstractShape circle = new Circle(0,5,"red", 10);
        AbstractShape circleClone = circle.clone();

        System.out.println("Circle 1");
        System.out.println(circle);

        System.out.println("Circle 1 - clone");
        System.out.println(circleClone);

        System.out.println(circle == circleClone);

        // example Rectangle cloning without Abstract class
        Rectangle rectangle = new Rectangle(10,5, "blue");
        Rectangle rectangleClone = rectangle.clone();

        System.out.println(rectangle);
        System.out.println(rectangleClone);
        System.out.println(rectangle==rectangleClone);

    }
}
