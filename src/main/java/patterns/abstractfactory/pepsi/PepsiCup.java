package patterns.abstractfactory.pepsi;

import patterns.abstractfactory.Cup;

public class PepsiCup implements Cup {
    @Override
    public void printCollor() {
        System.out.println("Blue metal cup");
    }
}
