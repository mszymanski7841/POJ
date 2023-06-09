package Zad6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj godzinę w formacie HH:mm: ");
        String godzinaWejsciowa = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Wybierz kraj w którym chcesz sprawdzić godzinę: ");
        System.out.println("1. Australia");
        System.out.println("2. Japonia");
        System.out.println("3. USA (Los Angeles)");

        int kraj = scanner.nextInt();
        ZoneId strefa = null;

        LocalTime localTime = LocalTime.parse(godzinaWejsciowa, formatter);

            switch (kraj) {
                case 1:
                    strefa = ZoneId.of("Australia/Melbourne");
                    break;
                case 2:
                    strefa = ZoneId.of("Asia/Tokyo");
                    break;
                case 3:
                    strefa = ZoneId.of("America/Los_Angeles");
                    break;
                default:
                    System.out.println("Podano błędną opcję");
                    break;
            }

            ZonedDateTime countryDateTime = ZonedDateTime.of(LocalDate.now(), localTime, ZoneId.systemDefault()).withZoneSameInstant(strefa);
            LocalTime countryTime = countryDateTime.toLocalTime();
            LocalDate countryDate = countryDateTime.toLocalDate();

            System.out.println("Data i godzina w wybranym kraju: " + countryDate + " " + countryTime.format(formatter));
    }
}