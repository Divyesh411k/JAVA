import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q1 {
    public static void main(String[] args) {

        JFrame f = new JFrame("My Info");
        f.setSize(1000, 1000);
        f.setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        JLabel streetLabel = new JLabel("Street:");
        JLabel cityLabel = new JLabel("City:");
        JLabel pincodeLabel = new JLabel("Pin Code:");

        JTextField nameTextField = new JTextField();
        JTextField streetTextField = new JTextField();
        JTextField cityTextField = new JTextField();
        JTextField pincodeTextField = new JTextField();

        JButton myInfoButton = new JButton("MyInfo");
        JTextArea infoTextArea = new JTextArea();

        nameLabel.setFont(new Font("Arial", Font.ITALIC, 32));
        streetLabel.setFont(new Font("Arial", Font.ITALIC, 32));
        cityLabel.setFont(new Font("Arial", Font.ITALIC, 32));
        pincodeLabel.setFont(new Font("Arial", Font.ITALIC, 32));
        infoTextArea.setFont(new Font("Arial", Font.ITALIC, 32));

        myInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String street = streetTextField.getText();
                String city = cityTextField.getText();
                String pincode = pincodeTextField.getText();

                infoTextArea.setText(
                        "Name: " + name + "\nStreet: " + street + "\nCity: " + city + "\nPin Code: " + pincode);
            }
        });

        f.add(nameLabel);
        f.add(nameTextField);
        f.add(streetLabel);
        f.add(streetTextField);
        f.add(cityLabel);
        f.add(cityTextField);
        f.add(pincodeLabel);
        f.add(pincodeTextField);
        f.add(myInfoButton);
        f.add(infoTextArea);

        f.setVisible(true);
    }
}
