package Zad3;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        try {
            String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
            String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

            int result = divide(number,divider);
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Wprowadzono niepoprawne dane!");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Nie można dzielić przez 0!");
        }
    }


    private static int convertToInteger(String number) {
        return Integer.parseInt(number);
    }

    private static int divide(String number, String divider) {
        int num1 = convertToInteger(number);
        int num2 = convertToInteger(divider);
        return num1/num2;
    }
}
