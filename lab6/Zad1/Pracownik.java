public class Pracownik {
    String imie;
    String nazwisko;
    int dzienneWynagrodzenie;
    public Pracownik(){
        imie = "";
        nazwisko = "";
        dzienneWynagrodzenie = 0;
    }
    public Pracownik(String imie, String nazwisko, int dzienneWynagrodzenie){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzienneWynagrodzenie = dzienneWynagrodzenie;
    }
}
