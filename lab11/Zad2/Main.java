package Zad2;
import javax.swing.*;
import java.util.Random;

public class Main {
    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
    public static void main(String[] args) {
        Random random = new Random();
        int liczbaKomputera = random.nextInt(100-1)+1;

        while (true) {
            String liczba = JOptionPane.showInputDialog(null, "Podaj liczbę");
            int zgadywanaLiczba = convertToInteger(liczba);

            if (zgadywanaLiczba > liczbaKomputera) {
                JOptionPane.showMessageDialog(null, "Liczba jest za wysoka!");
            } else if (zgadywanaLiczba < liczbaKomputera) {
                JOptionPane.showMessageDialog(null, "Liczba jest za niska!");
            } else {
                JOptionPane.showMessageDialog(null, "Gratulacje! Zgadłeś liczbę!");
                break;
            }
        }
    }
}
