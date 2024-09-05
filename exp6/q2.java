import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JButton b1=new JButton("button1");
        f.add(b1);
        b1.setBounds(0, 0, 100, 100);
        JButton b2=new JButton("button2");
        f.add(b2);
        b2.setBounds(100, 100, 100, 100);
        JButton b3=new JButton("button3");
        f.add(b3);
        b3.setBounds(200, 200, 100, 100);
        JButton b4=new JButton("button4");
        b4.setBounds(300, 300, 100, 100);
        f.add(b4);
        JLabel Label = new JLabel("Button Name:");
        Label.setSize( 100, 500);
        f.add(Label,BorderLayout.SOUTH);
        
     ButtonClickListener listener = new ButtonClickListener(Label);
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
      }
}
        class ButtonClickListener implements ActionListener {
            private JLabel nameLabel;
            public ButtonClickListener(JLabel nameLabel) {
                this.nameLabel = nameLabel;
            }
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                String buttonName = clickedButton.getText();
                nameLabel.setText("Button Name: " + buttonName);
            }  
    }

