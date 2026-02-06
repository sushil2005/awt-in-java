import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseSumDifference extends JFrame {

    JTextField t1, t2;
    JLabel result;

    public MouseSumDifference() {
        setTitle("Mouse Sum Difference");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));

        t1 = new JTextField();
        t2 = new JTextField();
        result = new JLabel("Result");

        add(t1);
        add(t2);
        add(result);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText("Sum = " + (a+b));
            }

            public void mouseReleased(MouseEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText("Difference = " + (a-b));
            }
        });
    }

    public static void main(String[] args) {
        new MouseSumDifference().setVisible(true);
    }
}
