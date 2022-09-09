package learning_questions_answering.java_core.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // prepare list
        List<Player> lst = new ArrayList<>();
        lst.add(new Player(10, "Vasya", 20));
        lst.add(new Player(3, "Oleg", 19));
        lst.add(new Player(5, "Nikita", 23));

        // sort by default sorting methanism realized by Comparable interface (ranking sort)
        System.out.println("Ranking Sort: ");
        Collections.sort(lst);
        lst.forEach(System.out::println);

        // sort with Another Sorting mechanism with Comparator.
        System.out.println("Age comparator Sort: ");
        Comparator<Player> ageComparator = new PlayerAgeComparator();
        Collections.sort(lst, ageComparator);
        lst.forEach(System.out::println);


    }
}
