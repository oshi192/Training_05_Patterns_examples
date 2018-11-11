package patterns.factorymethod.model;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = createTransportBtType(TransportType.PLANE);
        Transport transport = transportFactory.createTransport();
        transport.startDelivery();
    }

    static TransportFactory createTransportBtType(TransportType type) {
        if (type == TransportType.PLANE) {
            return new PlaneTransportFactory();
        } else {
            return new ShiprTransportFactory();
        }
    }
}
