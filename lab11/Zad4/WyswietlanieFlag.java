package Zad4;
import javax.swing.*;
import java.awt.*;

public class WyswietlanieFlag extends JFrame {
    public WyswietlanieFlag() {
        setTitle("Wyświetlanie flag");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        //Polska
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 250, 100);
        g.setColor(Color.RED);
        g.fillRect(50, 150, 250, 100);

        // Francja
        g.setColor(Color.BLUE);
        g.fillRect(350, 50, 100, 200);
        g.setColor(Color.WHITE);
        g.fillRect(450, 50, 100, 200);
        g.setColor(Color.RED);
        g.fillRect(550, 50, 100, 200);


        //Monako
        g.setColor(Color.RED);
        g.fillRect(50, 300, 250, 100);
        g.setColor(Color.WHITE);
        g.fillRect(50, 400, 250, 100);

        //Włochy
        g.setColor(Color.GREEN);
        g.fillRect(350, 300, 100, 200);
        g.setColor(Color.WHITE);
        g.fillRect(450, 300, 100, 200);
        g.setColor(Color.RED);
        g.fillRect(550, 300, 100, 200);

        //Irlandia
        g.setColor(Color.GREEN);
        g.fillRect(700, 300, 100, 200);
        g.setColor(Color.WHITE);
        g.fillRect(800, 300, 100, 200);
        g.setColor(Color.ORANGE);
        g.fillRect(900, 300, 100, 200);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WyswietlanieFlag flagDisplay = new WyswietlanieFlag();
            flagDisplay.setVisible(true);
        });
    }
}