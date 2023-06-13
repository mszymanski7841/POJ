package Zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static <T> void wyswietlDuplikaty(List<T> lista){
        List <T> listaDuplikatow = new ArrayList<>();
        for(int i = 0; i<lista.size() - 1;i++){
            T element = lista.get(i);
            if(lista.get(i)==lista.get(i+1)){
                listaDuplikatow.add(element);
            }
        }
        System.out.println("Elementy które się powtarzają: " + listaDuplikatow);
    }
    private static <T> void usuwanieDuplikatow(List<T> lista){
        List <T> listaBezDuplikatow = new ArrayList<>();
        for(int i = 0; i<lista.size()-1;i++){
            T element = lista.get(i);
            if(!listaBezDuplikatow.contains(element)){
                listaBezDuplikatow.add(element);
            }
        }
        lista.clear();
        lista.addAll(listaBezDuplikatow);
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        System.out.println("Lista: " + lista);
        wyswietlDuplikaty(lista);
        usuwanieDuplikatow(lista);
        System.out.println("Lista po usunięciu duplikatów: " + lista);
    }
}
