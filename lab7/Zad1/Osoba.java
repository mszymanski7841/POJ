package Zad1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception {
//        if(imie.isEmpty() || nazwisko.isEmpty()){
//            throw new Exception("Imię lub nazwisko nie może być puste!");
//        }
        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public void setRokUrodzenia(int rokUrodzenia){
        this.rokUrodzenia = rokUrodzenia;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
    public String toString(){
        return getImie() + " " + getNazwisko() + " " + getRokUrodzenia();
    }
    public void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia) throws Exception{
        if(imie.isEmpty()){
            throw new Exception("Podano niewłaściwe imie!");
        }
        if(nazwisko.isEmpty()){
            throw new Exception("Podano niewłaściwe nazwisko!");
        }
        if(rokUrodzenia<1900 || rokUrodzenia>2020){
            throw new Exception("Podano niewłaściwy rok urodzenia!");
        }
    }
}
