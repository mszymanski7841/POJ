package Zad4;

import java.util.Comparator;

public class PredkoscComparator implements Comparator<Zawodnik> {
    public int compare(Zawodnik zawodnik1, Zawodnik zawodnik2){
        return Integer.compare(zawodnik1.getPredkoscMax(),zawodnik2.getPredkoscMax());
    }
}
