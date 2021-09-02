package learning_questions_answering.java_patterns.creational.prototype;

public class Rectangle {
    public int x;
    public int y;
    public String color;

    public Rectangle(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Rectangle clone() {
        return new Rectangle(this.x, this.y, this.color);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
