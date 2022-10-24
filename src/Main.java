import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Courier New", Font.PLAIN, 50));
        g.drawString("Савчук Дмитро", 200, 200);

        g.drawLine(20, 20, 20, 100);
        g.drawLine(20, 20, 50, 60);
        g.drawLine(50, 60, 80, 20);
        g.drawLine(80, 20, 80, 100);


        g.drawPolygon(new int[] {200, 200, 300}, new int[] {400, 200, 400}, 3);
    }

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 600);
        setVisible(true);
    }
}