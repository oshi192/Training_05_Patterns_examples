package patterns.abstractfactory;

import patterns.abstractfactory.cocacola.CocaColaWaterFactory;
import patterns.abstractfactory.pepsi.PesiColaWaterFactory;

public class Main {
    public static void main(String[] args) {
        SodaWaterFactory firstFactory = new PesiColaWaterFactory();
        Bottle firstBottle = firstFactory.getBottle();
        Cup firstCup = firstFactory.getCup();
        Water firstWater = firstFactory.getWater();

        SodaWaterFactory secondFactory = new CocaColaWaterFactory();
        Bottle secondBottle = secondFactory.getBottle();
        Cup secondCup = secondFactory.getCup();
        Water secondWater = secondFactory.getWater();

        System.out.println("Parts from first factory: ");
        firstBottle.printType();
        firstCup.printCollor();
        firstWater.printTypeOfWater();

        System.out.println("\nParts from second factory: ");
        secondBottle.printType();
        secondCup.printCollor();
        secondWater.printTypeOfWater();
    }
}
