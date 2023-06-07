public class Main {
    public static void main(String[] args) {
        Pracownik[] pracownicy = new Pracownik[2];
        pracownicy[0] = new Pracownik("Jan", "Kowalski", 400);
        pracownicy[1] = new Pracownik("Magda", "Magdowicz", 500);

        Firma firma = new Firma(pracownicy);
        System.out.println("Mieszieczny koszt firmy wynosi: " + firma.obliczMiesiecznyKosztFirmy());
        System.out.println("Roczny koszt firmy wynosi: " + firma.obliczRocznyKosztFirmy());
        System.out.println("Koszt firmy w wybranym okresie wynosi: " + firma.obliczKosztFirmy(Czas.MIESIAC,2));
    }
}
