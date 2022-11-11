import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        JFrame myFrame = new JFrame("Розрахунок функції");

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel myPanel1 = new JPanel();
        JPanel myPanel2 = new JPanel();
        JPanel myPanel3 = new JPanel();
        JPanel myPanel4 = new JPanel();
        myPanel1.setBorder(BorderFactory.createEtchedBorder());
        myPanel2.setBorder(BorderFactory.createEtchedBorder());
        myPanel3.setBorder(BorderFactory.createEtchedBorder());
        myPanel4.setBorder(BorderFactory.createEtchedBorder());


        FlowLayout F1 = new FlowLayout();
        GridLayout F2 = new GridLayout(2,3,10,10);
        myPanel1.setLayout(F1);
        myPanel2.setLayout(F1);
        myPanel3.setLayout(F1);
        myPanel4.setLayout(F1);
        myFrame.setLayout(F2);

        JLabel label1 = new JLabel("Введіть значення:");
        JLabel label2 = new JLabel("а = ");
        JTextField field1 = new JTextField("",5);
        JLabel label3 = new JLabel("b = ");
        JTextField field2 = new JTextField("",5);
        myPanel1.add(label1);
        myPanel1.add(label2);
        myPanel1.add(field1);
        myPanel1.add(label3);
        myPanel1.add(field2);


        JLabel label4 = new JLabel("Вивід проміжних значень:");
        JLabel label5 = new JLabel("c = ");
        JTextField field3 = new JTextField("",5);
        JLabel label6 = new JLabel("d = ");
        JTextField field4 = new JTextField("",5);


        field3.setEnabled(false);
        field4.setEnabled(false);
        label6.setEnabled(false);


        myPanel2.add(label4);
        myPanel2.add(label5);
        myPanel2.add(field3);
        myPanel2.add(label6);
        myPanel2.add(field4);


        JLabel label7 = new JLabel("Вивід значення функції:");
        JLabel label8 = new JLabel("f = ");
        JTextField field5 = new JTextField("",10);
        myPanel3.add(label7);
        myPanel3.add(label8);
        myPanel3.add(field5);


        JButton myButton = new JButton("Обчислити");
        myPanel4.add(myButton);


        myFrame.getContentPane().add(myPanel1);
        myFrame.getContentPane().add(myPanel2);
        myFrame.getContentPane().add(myPanel3);
        myFrame.getContentPane().add(myPanel4);

        myFrame.setSize(800, 250);
        myFrame.setVisible(true);


        myButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                float a, b, c, d, f;

                a = Float.parseFloat(field1.getText().toString());
                b = Float.parseFloat(field2.getText().toString());
                d= (float) (4*a+Math.sqrt(b)*Math.sqrt(b));
                c = (float) Math.sqrt(Math.pow(a,3)-b);
                f = c*d;

                field3.setText(""+ c);
                field4.setText(""+ d);
                field5.setText(""+ f);
            }
        });
    }
}
