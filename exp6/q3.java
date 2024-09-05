import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(8, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField();

        JLabel sapidLabel = new JLabel("SAP ID:");
        JTextField sapidTextField = new JTextField();

        JLabel collegeLabel = new JLabel("College Name:");
        JTextField collegeTextField = new JTextField();

        JLabel dobLabel = new JLabel("Date of Birth (yyyy-MM-dd):");
        JTextField dobTextField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressTextArea = new JTextArea();

        JButton registerButton = new JButton("Register");

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String sapid = sapidTextField.getText();
                String college = collegeTextField.getText();
                String dob = dobTextField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                String address = addressTextArea.getText();

                JOptionPane.showMessageDialog(frame, "Registered User:\nName: " + name + "\nSAP ID: " + sapid +
                        "\nCollege Name: " + college + "\nDOB: " + dob + "\nGender: " + gender + "\nAddress: " + address);
            }
        });

        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(sapidLabel);
        frame.add(sapidTextField);
        frame.add(collegeLabel);
        frame.add(collegeTextField);
        frame.add(dobLabel);
        frame.add(dobTextField);
        frame.add(genderLabel);
        frame.add(maleRadioButton);
        frame.add(new JLabel());
        frame.add(femaleRadioButton);
        frame.add(addressLabel);
        frame.add(new JScrollPane(addressTextArea));
        frame.add(registerButton);

        frame.setVisible(true);
    }
}
