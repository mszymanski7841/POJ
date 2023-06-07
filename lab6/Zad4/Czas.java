package Zad4;

import java.time.LocalTime;

public class Czas {
    int godziny;
    int minuty;

    public Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    public String toString() {
        return godziny + "h " + minuty + " min";
    }

    public Czas dodajCzas(Czas t) {
        LocalTime czas = LocalTime.now();
        LocalTime wynik = czas.plusHours(godziny).plusMinutes(minuty);
        int godzina = wynik.getHour();
        int minuta = wynik.getMinute();
        return new Czas(godzina, minuta);
    }

    public Czas odejmijCzas(Czas t) {
        LocalTime czas = LocalTime.now();
        LocalTime wynik = czas.minusHours(godziny).minusMinutes(minuty);
        int godzina = wynik.getHour();
        int minuta = wynik.getMinute();
        return new Czas (godzina, minuta);
    }
    public Czas pomnozCzas(int krotnosc){
        int calkowityCzasWMinutach = (godziny * 60 + minuty) * krotnosc;
        int mnozenieGodzin = calkowityCzasWMinutach / 60;
        int mnozenieMinut = calkowityCzasWMinutach % 60;
        return new Czas(mnozenieGodzin, mnozenieMinut);
    }
}
