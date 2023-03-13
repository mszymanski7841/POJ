import java.util.Scanner;
public class Zadanie2 {
    static void minValue(int[] tab, int a){
        int min = tab[0];
        for(int i=0; i<a; i++){
            if(tab[i]<min){
                min = tab[i];
            }
        }
        System.out.println("Najmniejsza wartosc tablicy wynosi: " + min);
    }
    static void maxValue(int[] tab, int a){
        int max = 0;
        for(int i=0; i<a; i++){
            if(tab[i]>max){
                max = tab[i];
            }
        }
        System.out.println("Najwieksza wartosc tablicy wynosi: " + max);
    }
    static void arraySum(int[] tab, int a){
        int sum = 0;
        for(int i=0; i<a; i++){
            sum += tab[i];
        }
        System.out.println("Suma wszystkich wartosci tablicy wynosi: " + sum);
    }
    static void avgValue(int[] tab, int a){
        double sum = 0;
        for(int i=0; i<a; i++){
            sum += tab[i];
        }
        double avg = sum/a;
        System.out.println("Srednia tablicy wynosi: " + avg);
    }
    static void median(int[] tab, int a){
        int med;
            if(a%2==0){
                med = (tab[(a/2)-1]+tab[(a/2)])/2;
            }else{
                med = tab[(a/2)];
            }

        System.out.println("Mediana tablicy wynosi: " + med);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy");
        int wielkosc = scan.nextInt();
        int[] liczby = new int[wielkosc];
        System.out.println("Podaj pierwsza cyfre do tablicy");
        int cyfra = scan.nextInt();
        liczby[0] = cyfra;

        for(int i=1; i<wielkosc; i++){
            if(liczby[i-1]%2==0){
                liczby[i] = liczby[i-1]+2;
            }else{
                liczby[i] = liczby[i-1]+1;
            }
        }
        for(int i=0; i<wielkosc; i++){
            System.out.print(liczby[i]+";");
        }
        System.out.println();

        minValue(liczby,wielkosc);
        maxValue(liczby,wielkosc);
        arraySum(liczby, wielkosc);
        avgValue(liczby, wielkosc);
        median(liczby,wielkosc);


    }
}
