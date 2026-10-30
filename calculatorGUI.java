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

        JTextArea txtResult = new JTextArea(8, 25);
        txtResult.setEditable(false);

          JButton btnResult = new JButton("RESULT");
           JButton btnClear = new JButton("CLEAR");



        frame.add(lblNum1);
        frame.add(txtNum1);
        frame.add(lblNum2);
        frame.add(txtNum2);
        frame.add(btnResult);
        frame.add(btnClear);
        frame.add(txtResult);

       

        btnResult.addActionListener(e -> {

            String num1Text = txtNum1.getText().trim();
String num2Text = txtNum2.getText().trim();

if (num1Text.isEmpty() || num2Text.isEmpty()) {
    JOptionPane.showMessageDialog(frame,
        "Please enter two numbers.");
    return;
}

double num1, num2;

try {
    num1 = Double.parseDouble(num1Text);
    num2 = Double.parseDouble(num2Text);
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(frame,
        "Please enter valid numbers.");
    return;
}

double add = num1 + num2;
double subtract = num1 - num2;
double multiply = num1 * num2;

String divide;

if (num2 == 0) {
    divide = "Cannot divide by zero";
} else {
    divide = String.valueOf(num1 / num2);
}

txtResult.setText(
    "Addition: " + add +
    "\nSubtraction: " + subtract +
    "\nMultiplication: " + multiply +
    "\nDivision: " + divide
);

        });
     

btnClear.addActionListener(e -> {
    txtNum1.setText("");
    txtNum2.setText("");
    txtResult.setText("Result: ");
    
});

 frame.setVisible(true);

    
    }
}