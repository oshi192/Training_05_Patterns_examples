package patterns.factorymethod.model;

public class Ship implements Transport {
    public void startDelivery() {
        System.out.println("Delivers parcels by water");
    }
}
