package learning_questions_answering;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
Статический импорт в языке Java
В Java имеется языковое средство, расширяющее возможности ключевого сло­ва import и называемое статическим импортом.
Благодаря статическому импорту появляется возможность ссылаться на статические члены непосредственно по именам, не угочняя ихименем класса.
Это упрощает и сокращает синтаксис, требующийся для работы со статическими членами.
*/

public class Learning_1_Static_import_learning {
    public static void main(String[] args) {
        double a1 = 3.0;
        double a2 = 4.0;

        double result;
        // static import help to reference method without full path
        System.out.println("Sqrt root of a2 is: "+sqrt(a2));

        System.out.println("Power a1 in a2 is: "+pow(a1, a2));

    }

}
