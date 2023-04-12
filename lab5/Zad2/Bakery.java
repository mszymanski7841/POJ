public class Bakery extends Shop{
    String[] products = {"bułka kajzerka", "chleb krojony", "pączek"};

    public Bakery(String address, int size){
        super(address, size);
    }
    public String getInformation(){
        String productsString = String.join(",", products);
        return String.format("Piekarnia znajduje się w: " + this.address + " i jej wielkosc wynosi: " + size + "m^2. Produkty w piekarni: "+ productsString);
    }
}
