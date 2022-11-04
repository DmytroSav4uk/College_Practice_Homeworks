import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Тест ProgressBar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 2, 4, 4));

        JPanel mypanel = new JPanel();
        mypanel.setBackground(Color.orange);
        frame.add(mypanel);

        JProgressBar mybar = new JProgressBar();
        JProgressBar mybar2 = new JProgressBar();
        JProgressBar mybar3 = new JProgressBar();
        JProgressBar mybar4 = new JProgressBar();
        JProgressBar mybar5 = new JProgressBar();
        JProgressBar mybar6 = new JProgressBar();
        JProgressBar mybar7 = new JProgressBar();

        mybar.setMinimum(0);
        mybar.setMaximum(10);
        mybar.setStringPainted(true);
        mybar.setValue(0);

        mybar2.setMinimum(10);
        mybar2.setMaximum(20);
        mybar2.setStringPainted(true);
        mybar2.setValue(0);

        mybar3.setMinimum(30);
        mybar3.setMaximum(40);
        mybar3.setStringPainted(true);
        mybar3.setValue(0);

        mybar4.setMinimum(40);
        mybar4.setMaximum(50);
        mybar4.setStringPainted(true);
        mybar4.setValue(0);

        mybar5.setMinimum(50);
        mybar5.setMaximum(60);
        mybar5.setStringPainted(true);
        mybar5.setValue(0);

        mybar6.setMinimum(70);
        mybar6.setMaximum(80);
        mybar6.setStringPainted(true);
        mybar6.setValue(0);

        mybar7.setMinimum(90);
        mybar7.setMaximum(100);
        mybar7.setStringPainted(true);
        mybar7.setValue(0);

        mypanel.add(mybar);
        mypanel.add(mybar2);
        mypanel.add(mybar3);
        mypanel.add(mybar4);
        mypanel.add(mybar5);
        mypanel.add(mybar6);
        mypanel.add(mybar7);

        frame.setSize(601, 601);

        for (int i = mybar.getMinimum(); i <= mybar.getMaximum(); i++) {
            Thread.sleep(60);
            mybar.setValue(i);
        }
        for (int i = mybar2.getMinimum(); i <= mybar2.getMaximum(); i++) {
            Thread.sleep(60);
            mybar2.setValue(i);
        }
        for (int i = mybar3.getMinimum(); i <= mybar3.getMaximum(); i++) {
            Thread.sleep(60);
            mybar3.setValue(i);
        }

        for (int i = mybar4.getMinimum(); i <= mybar4.getMaximum(); i++) {
            Thread.sleep(60);
            mybar4.setValue(i);
        }
        for (int i = mybar5.getMinimum(); i <= mybar5.getMaximum(); i++) {
            Thread.sleep(60);
            mybar5.setValue(i);
        }
        for (int i = mybar6.getMinimum(); i <= mybar6.getMaximum(); i++) {
            Thread.sleep(60);
            mybar6.setValue(i);
        }
        for (int i = mybar7.getMinimum(); i <= mybar7.getMaximum(); i++) {
            Thread.sleep(60);
            mybar7.setValue(i);
        }
    }
}