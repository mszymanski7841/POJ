package Zad1;

public class Lista <E>{
    private E[] lista;

    public Lista(int rozmiar){
        lista = (E[]) new Object[rozmiar];
    }

    public boolean dodaj(E element){
        for(int i = 0; i<lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = element;
                return true;
            }
        }
        return false;
    }

    public boolean czyZawiera(E element){
        for(int i = 0; i<lista.length; i++){
            if(lista[i]==element){
                return true;
            }
        }
        return false;
    }

    public int zwrocIndeks(E element){
        int indeks = -1;
        for(int i = 0; i<lista.length;i++){
            if(lista[i]== element){
                indeks = i;
            }
        }
        return indeks;
    }

    public int zwrocOstatniIndeks(E element){
        int ostatniIndeks = -1;
        for(int i = 0; i<lista.length;i++){
            if(lista[i]==element){
                ostatniIndeks = i;
            }
        }
        return ostatniIndeks;
    }

    public E zwrocElement(int indeks){
        if(indeks >= 0 && indeks < lista.length){
            return lista[indeks];
        }
        return null;
    }

    public boolean podmienElement(int indeks, E element){
        if(indeks < 0 || indeks >= lista.length){
            return false;
        }
        lista[indeks] = element;
        return true;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (E e : lista) {
            if (e != null) {
                buffer.append(e + ",");
            }
        }
        if (buffer.length()>1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }
}
