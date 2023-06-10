package Zad6;

public class Main {
    public static void main(String[] args) {
        String tekst = "Ala ma kota";
        String tekstPoUsunieciu = TransformacjaString.usunZnaki(tekst, Znak.SAMOGLOSKA);
        String tekstPoZamianie = TransformacjaString.podmienZnaki(tekst, Znak.SPACJA,"A");
        String tekstPoZostawieniu = TransformacjaString.pozostawZnaki(tekst, Znak.SAMOGLOSKA);
        System.out.println(tekstPoUsunieciu);
        System.out.println(tekstPoZamianie);
        System.out.println(tekstPoZostawieniu);
    }
}
