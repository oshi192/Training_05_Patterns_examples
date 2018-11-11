package patterns.abstractfactory.pepsi;

import patterns.abstractfactory.Water;

public class PepsiWater implements Water {
    @Override
    public void printTypeOfWater() {
        System.out.println("PepsiCola water");
    }
}
