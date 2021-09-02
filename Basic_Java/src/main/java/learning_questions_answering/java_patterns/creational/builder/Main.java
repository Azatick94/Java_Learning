package learning_questions_answering.java_patterns.creational.builder;

public class Main {

    // creating flats
    public static void main(String[] args) {
        Flat flat1 = new FlatBuilder(1L).defineCity("Moscow")
                .defineFlatNumber(170)
                .defineArea(38)
                .defineNumberOfRooms(1)
                .buildFlat();

        Flat flat2 = new FlatBuilder(2L).defineCity("Kazan")
                .defineFlatNumber(100)
                .defineNumberOfRooms(2)
                .buildFlat();

        Flat flat3 = new FlatBuilder(3L)
                .defineNumberOfRooms(3)
                .defineArea(65)
                .buildFlat();

        System.out.println(flat1.toString());
        System.out.println(flat2.toString());
        System.out.println(flat3.toString());

    }

}
