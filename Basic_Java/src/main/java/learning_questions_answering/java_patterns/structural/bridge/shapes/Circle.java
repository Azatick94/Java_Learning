package learning_questions_answering.java_patterns.structural.bridge.shapes;

import learning_questions_answering.java_patterns.structural.bridge.colors.Color;

public class Circle implements Shape {
    private Color colour;

    public Circle(Color color) {
        this.colour = color;
    }

    @Override
    public void draw() {
        System.out.print("This is circle. My colour is: ");
        colour.draw();
    }
}
