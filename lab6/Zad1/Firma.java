 enum Czas{
     DZIEN,
     MIESIAC(20),
     ROK(240);
     int dni;
     Czas(){
         this.dni = 1;
     }
     Czas(int dni){
         this.dni = dni;
     }
}
public class Firma {
    Pracownik[] pracownicy;
    public Firma(Pracownik[] pracownicy){
        this.pracownicy = pracownicy;
    }

    public int obliczMiesiecznyKosztFirmy(){
        int koszt = 0;
    for(Pracownik pracownik : pracownicy) {
        koszt += pracownik.dzienneWynagrodzenie*Czas.MIESIAC.dni;
    }
        return koszt;
    }
    public int obliczRocznyKosztFirmy(){
        int koszt = 0;
        for(Pracownik pracownicy : pracownicy){
            koszt += pracownicy.dzienneWynagrodzenie*Czas.ROK.dni;
        }
        return koszt;
    }
    public double obliczKosztFirmy(Czas czas, int krotnosc){
        int koszt = 0;
        for (Pracownik pracownicy : pracownicy){
            koszt+= pracownicy.dzienneWynagrodzenie * czas.dni * krotnosc;
        }
        return koszt;

    }
    }
