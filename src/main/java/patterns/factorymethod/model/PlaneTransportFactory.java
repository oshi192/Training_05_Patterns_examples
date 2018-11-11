package patterns.factorymethod.model;

public class PlaneTransportFactory implements TransportFactory {
    public Transport createTransport() {
        return new Plane();
    }
}
