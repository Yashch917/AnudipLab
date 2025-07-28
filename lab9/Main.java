public class TransportTest {
    public static void main(String[] args) {
        FourWheeler car = new FourWheeler("Toyota", "Camry", 2022, 200);
        TwoWheeler bike = new TwoWheeler("Yamaha", "R15", 2023, 150);

        car.drive();
        bike.drive();

        System.out.println("Car: " + car.brand + " " + car.type + ", Year: " + car.manufactureYear + ", Max Speed: " + car.topSpeed);
        System.out.println("Bike: " + bike.brand + " " + bike.type + ", Year: " + bike.manufactureYear + ", Max Speed: " + bike.topSpeed);
    }
}
