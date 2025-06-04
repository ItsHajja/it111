import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        // Create a window

        JFrame window = new JFrame();
        // set the title
        window.setTitle("My Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.getContentPane().setBackground(Color.RED);

        window.setLocationRelativeTo(null);

        window.setLayout(null);

        JLabel myLabel = new JLabel("My First Big Label!!!");
        myLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        myLabel.setBounds(60, 40, 300, 30);
        window.add(myLabel);

        JTextField textField1 = new JTextField();
        textField1.setBounds(60, 80, 250, 30);
        window.add(textField1);

        JLabel myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setFont(new Font("Arial", Font.BOLD, 20));
        myLabel2.setBounds(60, 140, 300, 30);
        window.add(myLabel2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(60, 180, 250, 30);
        window.add(textField2);

        // display the window - if we do not dis[;ay the window, it will not display!
        // displaying the window is a boolean
        window.setVisible(true);

    }
}

