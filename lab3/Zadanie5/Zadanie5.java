import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Konto[] konta = new Konto[11];
        for(int i = 1; i<=10; i++){
            konta[i] = new Konto(i,100);
        }
        Bankomat bankomat = new Bankomat(konta);
        bankomat.Menu();
    }
}
