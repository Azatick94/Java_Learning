package learning_questions_answering.java_core.comparable_comparator;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getAge() - o2.getAge();
    }
}
