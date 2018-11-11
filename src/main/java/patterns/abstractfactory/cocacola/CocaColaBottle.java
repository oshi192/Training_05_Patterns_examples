package patterns.abstractfactory.cocacola;

import patterns.abstractfactory.Bottle;

public class CocaColaBottle implements Bottle {
    @Override
    public void printType() {
        System.out.println("Glass red bottle");
    }
}
