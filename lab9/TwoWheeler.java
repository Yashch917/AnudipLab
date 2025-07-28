class TwoWheeler extends Transport {

    TwoWheeler(String brand, String type, int manufactureYear, int topSpeed) {
        super(brand, type, manufactureYear, topSpeed);
    }

    @Override
    void drive() {
        System.out.println(brand + " " + type + " Bike is driving.");
    }
}
