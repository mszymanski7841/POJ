package Zad8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] studenci = new Student[3];
        studenci[0] = new Student("Andrzej", "Kowalski", "s12345");
        studenci[1] = new Student("Magda", "Magdowicz", "s92443");
        studenci[2] = new Student("Piotr", "Piotrkowski", "s43215");

        Arrays.sort(studenci);

        for(Student student : studenci){
            System.out.println(student.imie + " " + student.nazwisko + ", " + student.indeks);
        }
    }
}
