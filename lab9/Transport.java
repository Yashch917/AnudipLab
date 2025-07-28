class Transport {
    String brand;
    String type;
    int manufactureYear;
    int topSpeed;

    Transport(String brand, String type, int manufactureYear, int topSpeed) {
        this.brand = brand;
        this.type = type;
        this.manufactureYear = manufactureYear;
        this.topSpeed = topSpeed;
    }

    void drive() {
        System.out.println("Transport is moving.");
    }
}
