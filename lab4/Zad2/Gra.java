import java.util.Random;
import java.util.Scanner;
public class Gra {
    int randomNumber;
    int minNumber;
    int maxNumber;
    int guesses;

    public Gra(int minNumber, int maxNumber){
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        Random random = new Random();
        this.randomNumber = random.nextInt(maxNumber - minNumber) + minNumber;
        this.guesses = 0;
    }
    public void newGame(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę z wybranego zakresu: " + minNumber + "-" +maxNumber);
        while(guesses<5){
            System.out.println("Podaj liczbę: ");
            int inputNumber = scan.nextInt();
            guesses ++;

            if(inputNumber == randomNumber){
                System.out.println("Brawo! Udało ci się zgadnąć liczbę!");
                break;
            }
            else if(inputNumber>randomNumber){
                System.out.println("Podana liczba jest za duża!");
            }else{
                System.out.println("Podana liczba jest za mała!");
            }
        }
        if(guesses==5){
        System.out.println("Niestety nie udało Ci się odgadnąć liczby. Wylosowana liczba: " +randomNumber);
    }
    }

}
