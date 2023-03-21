package learning_questions_answering.algorithms.string_manipulations.pattern_searching;

public class SampleSubstringSearch {

    public static void main(String[] args) {

        String text = "randomText";
        String search = "dom2";

        if (searchSubstring(text, search)) {
            System.out.println("Contains");
        } else {
            System.out.println("Opps! Not Present!");
        }

    }

    public static boolean searchSubstring(String text, String subString) {
        return text.contains(subString);
    }


}
