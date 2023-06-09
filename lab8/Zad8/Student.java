package Zad8;

public class Student implements Comparable<Student> {
    String imie;
    String nazwisko;
    String indeks;

    public Student(String imie, String nazwisko, String indeks){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    @Override
    public int compareTo(Student o) {
        return this.indeks.compareTo(o.indeks);
    }
}

