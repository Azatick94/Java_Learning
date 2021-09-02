package learning_questions_answering.java_patterns.creational.builder;

public class Flat {
    private long id;

    private String city;
    private int flatNumber;
    private double area;
    private int numberOfRooms;

    public Flat(long id, String city, int flatNumber, double area, int numberOfRooms) {
        this.id = id;
        this.city = city;
        this.flatNumber = flatNumber;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", flatNumber=" + flatNumber +
                ", area=" + area +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
