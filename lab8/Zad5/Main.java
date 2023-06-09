package Zad5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        int rok = data.getYear();
        for(int i =0; i<100; i++){
            if(LocalDate.ofYearDay(rok,1).isLeapYear()){
                System.out.println(rok);
            }
            rok++;
        }

    }
}
