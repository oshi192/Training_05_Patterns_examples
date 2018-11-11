package patterns.abstractfactory.pepsi;

import patterns.abstractfactory.Bottle;

public class PepsiBottle implements Bottle {
    @Override
    public void printType() {
        System.out.println("Blue glass bottle");
    }
}
