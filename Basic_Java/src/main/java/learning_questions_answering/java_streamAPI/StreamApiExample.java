package learning_questions_answering.java_streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {

    public static void main(String[] args) {

        List<Integer> lstNumbers = Arrays.asList(1,2,3,4,5,6,7,8,10);

//      filtering map
        lstNumbers.stream().filter((x) -> x>4).
                map((x) -> "This "+x+" is greater than 4").
                forEach((x) -> System.out.println(x));
        System.out.println();


        lstNumbers.stream().filter((x) -> x>4).
                map((x) -> "This "+x+" is greater than 4").
                forEach(System.out::println); // аналогично "(x) -> System.out.println(x)"  записи
        System.out.println();




    }
}
