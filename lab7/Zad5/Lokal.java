package Zad5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lokal {
    private String nazwaLokalu;
    private String miejscowosc;
    private String kodPocztowy;
    private String ulica;
    private int numerDomu;
    private int numerLokalu;
    public Lokal(String nazwaLokalu, String adresLokalu){
        this.nazwaLokalu = nazwaLokalu;
        Pattern pattern = Pattern.compile("^(\\D*)\\s(\\d),\\s(\\d{2}-\\d{3})\\s(.*)");
        Matcher matcher = pattern.matcher(adresLokalu);
        if(matcher.matches()){
            ulica = matcher.group(1);
            kodPocztowy = matcher.group(3);
            miejscowosc = matcher.group(4);
            numerDomu = Integer.parseInt(matcher.group(2));
        }
    }
    public String toString() {;
        return nazwaLokalu + "\n" +
                "Miasto: " + miejscowosc + "\n" +
                "Ulica: " + ulica + "\n" +
                "Numer domu/lokalu: " +  numerDomu + "\n" +
                "Kod pocztowy: " + kodPocztowy;
    }
}
