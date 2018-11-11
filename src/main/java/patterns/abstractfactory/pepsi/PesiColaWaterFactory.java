package patterns.abstractfactory.pepsi;

import patterns.abstractfactory.Bottle;
import patterns.abstractfactory.Cup;
import patterns.abstractfactory.SodaWaterFactory;
import patterns.abstractfactory.Water;

public class PesiColaWaterFactory implements SodaWaterFactory {

    @Override
    public Bottle getBottle() {
        return new PepsiBottle();
    }

    @Override
    public Cup getCup() {
        return new PepsiCup();
    }

    @Override
    public Water getWater() {
        return new PepsiWater();
    }
}
