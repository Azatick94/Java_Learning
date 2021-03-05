package learning_questions_answering.java_UI_learning_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwingApplication {

    // https://www.javatpoint.com/java-swing
    public static void main(String[] args) {
        JFrame frame = new JFrame("Первое приложение");

        // configuring frame;
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
        // full-screen mode
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);



        //1) adding button to frame
        JButton button = new JButton("Click here!");
        button.setBounds(130,100,100,100);


        //2) Action listener
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to My Program.");

            }
        });

        frame.add(button);
        frame.add(tf);




    }

}
