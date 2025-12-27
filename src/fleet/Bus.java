package fleet;

public class Bus extends Vehicle {

    private int capacity;

    public Bus(String model, int year, double price, int capacity) {
        super(model, year, price);
        this.capacity = capacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.1;
    }

    @Override
    public void performService() {
        System.out.println("Bus service: " + model);
    }

    @Override
    public int getServiceIntervalKm() {
        return 20000;
    }

    @Override
    public String toString() {
        return super.toString() + " | capacity: " + capacity;
    }
}
