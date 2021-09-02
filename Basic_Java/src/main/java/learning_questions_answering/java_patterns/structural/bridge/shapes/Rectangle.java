package learning_questions_answering.java_patterns.structural.bridge.shapes;

import learning_questions_answering.java_patterns.structural.bridge.colors.Color;

public class Rectangle implements Shape {

    private Color colour;

    public Rectangle(Color colour) {
        this.colour = colour;
    }

    @Override
    public void draw() {
        System.out.print("This is rectangle. My colour is: ");
        colour.draw();
    }
}
