import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        JFrame myFrame = new JFrame("Калькулятор");

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //створюємо панель
        JPanel myPanel = new JPanel();

        FlowLayout F1 = new FlowLayout();
        myPanel.setLayout(F1);

        JLabel label1 = new JLabel("Цифра 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Цифра 2:");
        JTextField field2 = new JTextField(10);
        JTextField sumField = new JTextField(12);
        JTextField productField = new JTextField(12);
        JTextField shareField = new JTextField(12);
        JTextField differenceField = new JTextField(12);
        JButton myButton = new JButton("GO");

        myPanel.add(label1);
        myPanel.add(field1);
        myPanel.add(label2);
        myPanel.add(field2);
        myPanel.add(sumField);
        myPanel.add(productField);
        myPanel.add(shareField);
        myPanel.add(differenceField);
        myPanel.add(myButton);

        myFrame.setContentPane(myPanel);

        myFrame.setSize(400, 100);
        myFrame.setVisible(true);

        myButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                float a, b, sum, product ,share ,difference;

                a = Float.parseFloat(field1.getText().toString());
                b = Float.parseFloat(field2.getText().toString());

                sum = a+b;
                product = a*b;
                share = a/b;
                difference = a-b;

                sumField.setText("sum= "+ sum);
                productField.setText("product= "+ product);
                shareField.setText("share= "+ share);
                differenceField.setText("difference= "+ difference);
            }
        });
    }
}