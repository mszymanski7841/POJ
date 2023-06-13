package Zad3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String tekst = JOptionPane.showInputDialog(null,"Podaj tekst do wyświetlenia od tyłu");
        String odwroconyTekst ="";
        for(int i=0;i<tekst.length();i++){
            char ch = tekst.charAt(i);
            odwroconyTekst=ch+odwroconyTekst;
        }
        JOptionPane.showMessageDialog(null,String.format("Odwrócony tekst to: %s", odwroconyTekst));
    }
}
