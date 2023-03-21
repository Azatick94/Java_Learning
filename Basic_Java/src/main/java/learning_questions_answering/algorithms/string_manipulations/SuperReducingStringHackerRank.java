package learning_questions_answering.algorithms.string_manipulations;


/**
 * HACKERRANK PROBLEM
 * https://www.hackerrank.com/challenges/reduced-string/problem
 */
public class SuperReducingStringHackerRank {

//    public static void main(String[] args) {
//
//        String input = "baab";
//        String result = superReducedString(input);
//        assert result.equals("Empty String");
//
//    }

    public static String superReducedString(String s) {
        // Write your code here

        int size = s.length();

        if (size == 0) return "Empty String";
        if (size == 1) return s;

        // contains adjacent
        String text = s;
        while (containsAdjacent(text)) {
            text = removeAdjacent(text);
        }
        return text;

    }

    public static String removeAdjacent(String text) {

        int size = text.length();

        StringBuilder builder = new StringBuilder("");
        for (int i=0; i<size; i++) {

            char el1 = text.charAt(i);

            if (i+1 >= size) {
                builder.append(el1);
            }
            else {
                char el2 = text.charAt(i+1);
                // el comparison
                if (el1 != el2) {
                    builder.append(el1);
                }
                else {
                    i++;
                }

            }
        }

        String result = builder.toString();
        if (result.length()==0) {
            return "Empty String";
        }
        else {
            return builder.toString();
        }
    }

    public static boolean containsAdjacent(String text) {

        if (text.length()<1) return false;

        for (int i=0; i<text.length()-1; i++) {
            char it1 = text.charAt(i);
            char it2 = text.charAt(i+1);
            if (it1 == it2) return true;
        }
        return false;
    }


}
