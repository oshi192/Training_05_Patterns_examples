package patterns.flyweight;

import patterns.visitor.Developer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NoiseFactory factory = new NoiseFactory();

        List<Noise> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));
        listOfAnimals.add(factory.getNoiseByCreature("Cat"));
        listOfAnimals.add(factory.getNoiseByCreature("Dog"));

        for (Noise n:listOfAnimals){
            n.noise();
        }
    }
}
