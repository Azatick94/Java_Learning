package learning_questions_answering.java_patterns.creational.builder;

public class FlatBuilder {

    private long id;

    private String city;
    private int flatNumber;
    private double area;
    private int numberOfRooms;

    // constructor
    public FlatBuilder(long id) {
        this.id = id;
    }

    public FlatBuilder defineCity(String city) {
        this.city = city;
        return this;
    }

    public FlatBuilder defineFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
        return this;
    }

    public FlatBuilder defineArea(double area) {
        this.area = area;
        return this;
    }

    public FlatBuilder defineNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public Flat buildFlat() {
        Flat flat = new Flat(id, city, flatNumber, area, numberOfRooms);
        return flat;
    }
}
