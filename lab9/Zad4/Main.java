package Zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Maciej","Maciejowski",1,10);
        Zawodnik zawodnik2 = new Zawodnik("Andrzej","Andrzejowski",2,12);
        Zawodnik zawodnik3 = new Zawodnik("Marek", "Markowski", 3, 8);

        List<Zawodnik> zawodnicy = new ArrayList<>();
        zawodnicy.add(zawodnik1);
        zawodnicy.add(zawodnik2);
        zawodnicy.add(zawodnik3);
        System.out.println("Lista posortowana po imieniach:");
        Collections.sort(zawodnicy, new ImieComparator());
        for(Zawodnik zawodnik : zawodnicy){
            System.out.println(zawodnik.getImie()+ " " +zawodnik.getNazwisko()+" "+zawodnik.getNumer()+" "+zawodnik.getPredkoscMax());
        }
        System.out.println("Lista posortowana po numerach:");
        Collections.sort(zawodnicy, new NumerComparator());
        for(Zawodnik zawodnik : zawodnicy){
            System.out.println(zawodnik.getImie()+ " " +zawodnik.getNazwisko()+" "+zawodnik.getNumer()+" "+zawodnik.getPredkoscMax());
        }
        System.out.println("Lista posortowana po prędkości max:");
        Collections.sort(zawodnicy, new PredkoscComparator());
        for(Zawodnik zawodnik : zawodnicy){
            System.out.println(zawodnik.getImie()+ " " +zawodnik.getNazwisko()+" "+zawodnik.getNumer()+" "+zawodnik.getPredkoscMax());
        }
    }

}
