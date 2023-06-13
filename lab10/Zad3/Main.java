package Zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Integer> zliczWystapieniaSlow(String tekst){
        Map<String, Integer> wystapienieSlowa = new HashMap<>();
        String[] slowa = tekst.split("\\s");
        for(String slowo : slowa){
//            slowo = slowo.toLowerCase();
            if(wystapienieSlowa.containsKey(slowo)){
                int iloscWystapien = wystapienieSlowa.get(slowo);
                wystapienieSlowa.put(slowo, iloscWystapien+1);
            }else{
                wystapienieSlowa.put(slowo, 1);
            }
        }
        return wystapienieSlowa;
    }
    public static void main(String[] args) {
        String test = "Ala ma kota, kot ma Alę";
        Map<String, Integer> wystapieniaSlowa = zliczWystapieniaSlow(test);
        System.out.println(test+ " -> " +wystapieniaSlowa);
    }
}
