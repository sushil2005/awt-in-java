import javax.swing.*;
import java.awt.*;

public class GridBagForm01 extends JFrame {

    public GridBagForm01() {
        setTitle("GridBag Simple Form");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        JLabel lblName = new JLabel("Name:");
        JLabel lblEmail = new JLabel("Email:");
        JTextField txtName = new JTextField(15);
        JTextField txtEmail = new JTextField(15);
        JButton btnSubmit = new JButton("Submit");

        gbc.gridx = 0; gbc.gridy = 0;
        add(lblName, gbc);

        gbc.gridx = 1;
        add(txtName, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(lblEmail, gbc);

        gbc.gridx = 1;
        add(txtEmail, gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        add(btnSubmit, gbc);
    }

    public static void main(String[] args) {
        new GridBagForm01().setVisible(true);
    }
}
