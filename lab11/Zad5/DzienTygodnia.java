package Zad5;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.*;

public class DzienTygodnia extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField dateField;
    private JButton submitButton;

    public DzienTygodnia() {
        setTitle("Dzień Tygodnia");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        panel.add(new JLabel("Wprowadź datę w formacie DD.MM.RRRR:"));
        dateField = new JTextField();
        panel.add(dateField);

        submitButton = new JButton("Sprawdź dzień tygodnia");
        submitButton.addActionListener(this);
        panel.add(submitButton);

        label = new JLabel("", SwingConstants.CENTER);
        panel.add(label);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String inputDate = dateField.getText();
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate date = LocalDate.parse(inputDate, formatter);
                DayOfWeek dayOfWeek = date.getDayOfWeek();
                String dayOfWeekName = dayOfWeek.name();

                switch(dayOfWeekName){
                    case "MONDAY":
                        dayOfWeekName = "Poniedziałek";
                        break;
                    case "TUESDAY":
                        dayOfWeekName = "Wtorek";
                        break;
                    case "WEDNESDAY":
                        dayOfWeekName = "Środa";
                        break;
                    case "THURSDAY":
                        dayOfWeekName = "Czwartek";
                        break;
                    case "FRIDAY":
                        dayOfWeekName = "Piątek";
                        break;
                    case "SATURDAY":
                        dayOfWeekName = "Sobota";
                        break;
                    case "SUNDAY":
                        dayOfWeekName = "Niedziela";
                        break;
                    default:
                        break;
                }

                label.setText("Dzień tygodnia: " + dayOfWeekName);
            } catch (DateTimeParseException ex) {
                label.setText("Nieprawidłowy format daty!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DzienTygodnia program = new DzienTygodnia();
            program.setVisible(true);
        });
    }
}