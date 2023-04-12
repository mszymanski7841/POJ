
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Bus("Man", "Yellow", 50),
                new ElectricCar("Tesla", "White", 100),
                new SportsCar("Koenigsegg", "White", 482)
        };
        for (Car car : cars) {
            if(car instanceof SportsCar){
                SportsCar sportsCar = (SportsCar) car;
                System.out.println(sportsCar.make+" "+sportsCar.color+" "+sportsCar.topSpeed);
            }
            if(car instanceof Bus){
                Bus Bus = (Bus) car;
                System.out.println(Bus.make+" "+Bus.color+" "+Bus.numberOfSeats);
            }
            if(car instanceof ElectricCar){
                ElectricCar electricCar = (ElectricCar) car;
                System.out.println(electricCar.make+" "+electricCar.color+" "+electricCar.batteryCapacity);
            }
        }
    }
}
