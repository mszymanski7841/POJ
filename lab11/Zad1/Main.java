package Zad1;
import javax.swing.*;

public class Main {
    private static float convertToFloat(String number){
        return Float.parseFloat(number);
    }

    public static void main(String[] args) {
        String celsjusz = JOptionPane.showInputDialog(null, "Podaj temperaturę w celsjuszach");
        float farenheit = (convertToFloat(celsjusz)*9/5)+32;
        JOptionPane.showMessageDialog(null, String.format("Temperatura w farehneitach to: %.2f", farenheit ));
    }


}

