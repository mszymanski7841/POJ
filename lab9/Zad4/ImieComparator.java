package Zad4;

import java.util.Comparator;

public class ImieComparator implements Comparator<Zawodnik> {
    public int compare(Zawodnik zawodnik1, Zawodnik zawodnik2){
        return zawodnik1.getImie().compareTo(zawodnik2.getImie());
    }
}
