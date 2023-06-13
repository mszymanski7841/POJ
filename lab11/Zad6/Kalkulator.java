package Zad6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private JFrame frame;
    private JTextField poleWyniku;
    private double aktualnyWynik;
    private String aktualnyOperator;
    private boolean noweObliczenie;

    public Kalkulator() {
        frame = new JFrame("Prosty Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        poleWyniku = new JTextField();
        poleWyniku.setHorizontalAlignment(JTextField.RIGHT);
        poleWyniku.setEditable(false);
        panel.add(poleWyniku, BorderLayout.NORTH);

        JPanel panelPrzyciskow = new JPanel();
        panelPrzyciskow.setLayout(new GridLayout(4, 4));

        String[] etykietyPrzyciskow = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "C", "0", "=", "/"
        };

        for (String etykieta : etykietyPrzyciskow) {
            JButton przycisk = new JButton(etykieta);
            przycisk.addActionListener(new NasluchiwaczPrzycisku());
            panelPrzyciskow.add(przycisk);
        }

        panel.add(panelPrzyciskow, BorderLayout.CENTER);
        frame.getContentPane().add(panel);
    }

    public void wyswietl() {
        frame.setVisible(true);
    }

    private void obliczWynik() {
        String wprowadzone = poleWyniku.getText();
        String[] liczby = wprowadzone.split("\\" + aktualnyOperator);
        if (liczby.length == 2) {
            double liczba1 = Double.parseDouble(liczby[0]);
            double liczba2 = Double.parseDouble(liczby[1]);
            switch (aktualnyOperator) {
                case "+":
                    aktualnyWynik = liczba1 + liczba2;
                    break;
                case "-":
                    aktualnyWynik = liczba1 - liczba2;
                    break;
                case "*":
                    aktualnyWynik = liczba1 * liczba2;
                    break;
                case "/":
                    if (liczba2 != 0) {
                        aktualnyWynik = liczba1 / liczba2;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Nie można dzielić przez zero!", "Błąd", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }
            poleWyniku.setText(Double.toString(aktualnyWynik));
            noweObliczenie = true;
        }
    }

    private class NasluchiwaczPrzycisku implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String polecenie = e.getActionCommand();

            if (polecenie.matches("[0-9]")) {
                if (noweObliczenie) {
                    poleWyniku.setText("");
                    noweObliczenie = false;
                }
                poleWyniku.setText(poleWyniku.getText() + polecenie);
            } else if (polecenie.matches("[+\\-*/]")) {
                if (!noweObliczenie) {
                    obliczWynik();
                }
                aktualnyOperator = polecenie;
                poleWyniku.setText(poleWyniku.getText() + polecenie);
                noweObliczenie = false;
            } else if (polecenie.equals("=")) {
                obliczWynik();
            } else if (polecenie.equals("C")) {
                poleWyniku.setText("");
                noweObliczenie = false;
            }
        }
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.wyswietl();
    }
}