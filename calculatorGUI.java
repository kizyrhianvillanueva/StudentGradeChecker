import javax.swing.*;
import java.awt.*;

public class calculatorGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("calculatorGUI");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JLabel lblNum1 = new JLabel("First Number: ");
        JTextField txtNum1 = new JTextField(20);

        JLabel lblNum2 = new JLabel("Second Number: ");
        JTextField txtNum2 = new JTextField(20);

        frame.add(lblNum1);
        frame.add(txtNum1);
        frame.add(lblNum2);
        frame.add(txtNum2);

        frame.setVisible(true);
    }
}