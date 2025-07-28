public class MainClass {
    public static void main(String[] args) {
        CarClass car = new CarClass();
        MotorcycleClass bike = new MotorcycleClass();
        Garage garage = new Garage();


        garage.serviceVehicle(car);
        garage.serviceVehicle(bike);
    }
}
