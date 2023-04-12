public class Shop {
    public String address;
    public int size;

    public Shop(){
        address = "";
        size = 0;
    }
    public Shop(String address, int size){
        this.address = address;
        this.size = size;
    }
    public String getInformation(){
        return String.format("Informacja o sklepie: " + this.address + "; " + this.size);
    }

}
