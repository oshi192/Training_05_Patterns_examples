package patterns.abstractfactory;

public interface SodaWaterFactory {
    Bottle getBottle();
    Cup getCup();
    Water getWater();
}
