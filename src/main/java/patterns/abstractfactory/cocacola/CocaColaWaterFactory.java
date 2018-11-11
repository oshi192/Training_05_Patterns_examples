package patterns.abstractfactory.cocacola;

import patterns.abstractfactory.Bottle;
import patterns.abstractfactory.Cup;
import patterns.abstractfactory.SodaWaterFactory;
import patterns.abstractfactory.Water;

public class CocaColaWaterFactory implements SodaWaterFactory {
    @Override
    public Bottle getBottle() {
        return new CocaColaBottle();
    }

    @Override
    public Cup getCup() {
        return new CocaColaCup();
    }

    @Override
    public Water getWater() {
        return new CocaColaWater();
    }
}
