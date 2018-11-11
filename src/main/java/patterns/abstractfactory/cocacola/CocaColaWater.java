package patterns.abstractfactory.cocacola;

import patterns.abstractfactory.Water;

public class CocaColaWater implements Water {
    @Override
    public void printTypeOfWater() {
        System.out.println("CocaCola water");
    }
}
