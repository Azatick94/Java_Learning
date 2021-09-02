package learning_questions_answering.java_patterns.creational.prototype;

public class Circle extends AbstractShape {
    public int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle.x, circle.y, circle.color);
        this.radius = circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    // should implement clone to return clone of object
    @Override
    public AbstractShape clone() {
        return new Circle(this);
    }
}
