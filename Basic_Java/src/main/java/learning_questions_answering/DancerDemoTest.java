package learning_questions_answering;

public class DancerDemoTest {

    public static void main(String[] args) {
        Dancer breakDancer = new BreakDancer();
        Dancer classicDancer = new ClassicDancer();
        Dancer simpleDancer = new Dancer();

        breakDancer.dance();
//        breakDancer.trick();

        classicDancer.dance();
        simpleDancer.dance();

    }

}
