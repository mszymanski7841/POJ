import java.util.Random;

public class Zawodnik {
    String imie;
    int vmin;
    int vmax;
    double dystans;

    public Zawodnik() {
        imie = "";
        vmin = 0;
        vmax = 0;
        dystans = 0;
    }

    public Zawodnik(String imie, int vmin, int vmax) {
        this.imie = imie;
        this.vmin = vmin;
        this.vmax = vmax;
        this.dystans = 0;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + imie + " biegam z prędkością " + vmin + "-" + vmax + " km/h.");
    }

    public void biegnij() {
        Random random = new Random();
        int predkosc = random.nextInt(vmax - vmin) + vmin;
        System.out.println(predkosc);
        double droga = ((double) predkosc * 3600) / 1000;
        dystans += droga;
        System.out.println("Zawodnik " + imie + " przebiegł " + dystans + " km");

    }
}
