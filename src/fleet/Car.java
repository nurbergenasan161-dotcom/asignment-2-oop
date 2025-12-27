package fleet;

public class Car extends Vehicle {

    private int doors;

    public Car(String model, int year, double price, int doors) {
        super(model, year, price);
        this.doors = doors;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.05;
    }

    @Override
    public void performService() {
        System.out.println("Car service: " + model);
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    @Override
    public String toString() {
        return super.toString() + " | doors: " + doors;
    }
}
