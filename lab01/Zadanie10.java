import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        int random = (int)(Math.random()*3);
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz jaki przedmiot wybierasz wpisujac cyfre 0-2");
        System.out.println("0.Kamien");
        System.out.println("1.Papier");
        System.out.println("2.Nozyce");
        System.out.println("Wpisz cyfre:");
        int num = scan.nextInt();
        switch(num){
            case 0:
                System.out.println("WYBRALES: kamien");
                break;
            case 1:
                System.out.println("WYBRALES: papier");
                break;
            case 2:
                System.out.println("WYBRALES: nozyce");
                break;
        }
        switch(random){
            case 0:
                System.out.println("KOMPUTER: kamien");
                break;
            case 1:
                System.out.println("KOMPUTER: papier");
                break;
            case 2:
                System.out.println("KOMPUTER: nozyce");
                break;
        }
        if (random == num){
            System.out.println("Remis");
        }
        if (random == 0 && num == 1){
            System.out.println("Wygrales");
        }
        if (random == 1 && num == 0){
            System.out.println("Przegrales");
        }
        if(random == 0 && num == 2){
            System.out.println("Przegrales");
        }
        if(random == 2 && num == 0){
            System.out.println("Wygrales");
        }
        if(random == 1 && num == 2){
            System.out.println("Wygrales");
        }
        if(random == 2 && num == 1){
            System.out.println("Przegrales");
        }


    }
}
