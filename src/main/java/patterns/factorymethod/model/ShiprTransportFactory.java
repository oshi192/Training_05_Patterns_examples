package patterns.factorymethod.model;

public class ShiprTransportFactory implements TransportFactory{
    public Transport createTransport() {
        return new Ship();
    }
}
