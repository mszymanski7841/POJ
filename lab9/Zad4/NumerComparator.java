package Zad4;

import java.util.Comparator;

public class NumerComparator implements Comparator<Zawodnik> {
    public int compare(Zawodnik zawodnik1, Zawodnik zawodnik2){
        return Integer.compare(zawodnik1.getNumer(),zawodnik2.getNumer());
    }
}
