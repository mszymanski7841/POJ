package Zad7;

public class Main {
    public static int sumowanieTablic(int[]... tablice){
        int suma = 0;
        for (int[] tablica : tablice) {
            for (int num : tablica) {
                suma += num;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] tab1 = {2, 4, 7};
        int[] tab2 = {3, 1, 6};
        int[] tab3 = {5, 10, 15};
        int[] tab4 = {1, 2, 3};

        System.out.println("Suma tablic: " + sumowanieTablic(tab1, tab2, tab3, tab4));
    }
}
