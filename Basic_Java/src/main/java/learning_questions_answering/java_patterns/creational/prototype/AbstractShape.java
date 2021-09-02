package learning_questions_answering.java_patterns.creational.prototype;

public abstract class AbstractShape {
    public int x;
    public int y;
    public String color;

    public AbstractShape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract AbstractShape clone();
}
