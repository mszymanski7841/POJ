package Zad4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, Set<Integer>> skorowidzLiterowy(String tekst){
        Map<String, Set<Integer>> skorowidz = new HashMap<>();
        for(int i = 0; i<tekst.length(); i++){
            String litera = tekst.substring(i, i+1);
            if(!skorowidz.containsKey(litera)){
                skorowidz.put(litera, new HashSet<>());
            }
            skorowidz.get(litera).add(i);
        }
        return skorowidz;
    }

    public static void main(String[] args) {
        String tekst = "Hello";
        Map<String, Set<Integer>> skorowidz = skorowidzLiterowy(tekst);
        for (Map.Entry<String, Set<Integer>> c : skorowidz.entrySet()) {
            String litera = c.getKey();
            Set<Integer> indeksy = c.getValue();
            System.out.println(litera + " -> " + indeksy);
        }
    }
}
