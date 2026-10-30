import javax.swing.*;
import java.awt.*;

public class calculatorGUI{
    
    public static void main(String[] args){

        JFrame frame = new JFrame("calculatorGUI");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        frame.setVisible(true);
    }
}