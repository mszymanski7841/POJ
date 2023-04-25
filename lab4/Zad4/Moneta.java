import java.util.Random;

public class Moneta {
    int orzeł = 0;
    int reszka = 0;

    public void rzutMoneta(double rzut){
        Random random = new Random();
        for(int i=0; i<rzut; i++) {
            int los = random.nextInt(2);
            System.out.println(los);
            if (los == 0) {
                orzeł++;
            } else {
                reszka++;
            }
        }
        double procOrzeł = orzeł/rzut*100;
        double procReszka = reszka/rzut*100;
        System.out.println("Orzeł: " + procOrzeł+"%, reszka: "+procReszka+"%.");
    }
}
