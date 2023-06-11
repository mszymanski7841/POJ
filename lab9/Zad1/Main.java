package Zad1;

public class Main {
    public static void main(String[] args) {
        Lista<String> listaString = new Lista<>(6);
        Lista<Integer> listaInteger = new Lista<>(6);

        listaInteger.dodaj(1);
        listaInteger.dodaj(2);
        listaInteger.dodaj(3);
        listaInteger.dodaj(2);
        listaInteger.dodaj(4);

        listaString.dodaj("raz");
        listaString.dodaj("raz");
        listaString.dodaj("dwa");
        listaString.dodaj("trzy");

        System.out.println(listaInteger.toString());

        System.out.println(listaInteger.czyZawiera(1));
        System.out.println(listaInteger.dodaj(6));
        System.out.println(listaInteger.czyZawiera(6));
        System.out.println(listaInteger.zwrocIndeks(1));
        System.out.println(listaInteger.zwrocOstatniIndeks(2));
        System.out.println(listaInteger.zwrocElement(7));
        System.out.println(listaInteger.podmienElement(2,5));
        System.out.println(listaInteger.toString());

        System.out.println(listaString.toString());
        System.out.println(listaString.czyZawiera("raz"));
        System.out.println(listaString.czyZawiera("cztery"));
        System.out.println(listaString.dodaj("cztery"));
        System.out.println(listaString.zwrocIndeks("dwa"));
        System.out.println(listaString.zwrocOstatniIndeks("raz"));
        System.out.println(listaString.zwrocElement(3));
        System.out.println(listaString.podmienElement(3,"siedem"));
        System.out.println(listaString.toString());


    }
}
