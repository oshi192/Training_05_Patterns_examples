package patterns.factorymethod.model;

public class Plane implements Transport {
    public void startDelivery() {
        System.out.println("Delivers parcels by air");
    }
}
