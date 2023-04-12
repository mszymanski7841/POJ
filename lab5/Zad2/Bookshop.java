public class Bookshop extends Shop{
    String[] products = {"Książka kucharska", "Harry Potter i Komnata Tajemnic", "Jak wytresować psa?"};
    public Bookshop(String address, int size){
        super(address, size);
    }
    public String getInformation(){
        String productsString = String.join(",", products);
        return String.format("Księgarnia znajduje się w: " + this.address + " i jej wielkosc wynosi: " + size + "m^2. Produkty w księgarni: "+ productsString);
    }

}
