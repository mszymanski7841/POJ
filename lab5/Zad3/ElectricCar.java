public class ElectricCar extends Car{
    int batteryCapacity;
    public ElectricCar(String make, String color, int batteryCapacity){
        super(make, color);
        this.batteryCapacity = batteryCapacity;
    }
}
