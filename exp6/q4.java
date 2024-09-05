import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q4 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout( new GridLayout(5,5));

        JTextArea TextArea1 = new JTextArea();
        TextArea1.setFont(new Font("Arial", Font.ITALIC, 32));
        JTextArea TextArea2 = new JTextArea();
        TextArea2.setFont(new Font("Arial", Font.ITALIC, 32));
        JButton bequal=new JButton("=");
        JButton bdiv=new JButton("/");
        JButton bclear=new JButton("CE");
        JButton badd=new JButton("+");
        JButton bsub=new JButton("-");
        JButton bmul=new JButton("*");
        JButton bdot=new JButton(".");
        JButton bmod=new JButton("%");
        JButton bsq=new JButton("x^2");
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");


        f.add(TextArea1);f.add(TextArea2);f.add(bequal); f.add(bdiv);
        f.add(b1);f.add(b2);f.add(b3);f.add(badd);
        f.add(b4);f.add(b5);f.add(b6);f.add(bsub);
        f.add(b7);f.add(b8);f.add(b9);f.add(bmul);
        f.add(bclear);f.add(bdot);f.add(bmod);f.add(bsq);

        bequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




        

    }
}
