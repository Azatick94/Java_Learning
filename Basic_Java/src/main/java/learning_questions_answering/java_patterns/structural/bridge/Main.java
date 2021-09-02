package learning_questions_answering.java_patterns.structural.bridge;

import learning_questions_answering.java_patterns.structural.bridge.colors.Blue;
import learning_questions_answering.java_patterns.structural.bridge.colors.Red;
import learning_questions_answering.java_patterns.structural.bridge.shapes.Circle;
import learning_questions_answering.java_patterns.structural.bridge.shapes.Rectangle;
import learning_questions_answering.java_patterns.structural.bridge.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(new Red());
        Shape circle2 = new Circle(new Blue());
        Shape rectangle = new Rectangle(new Red());

        circle1.draw();
        System.out.println();
        circle2.draw();
        System.out.println();
        rectangle.draw();
    }
}
