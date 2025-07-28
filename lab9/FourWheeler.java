class FourWheeler extends Transport {

    FourWheeler(String brand, String type, int manufactureYear, int topSpeed) {
        super(brand, type, manufactureYear, topSpeed);
    }

    @Override
    void drive() {
        System.out.println(brand + " " + type + " Car is driving.");
    }
}
