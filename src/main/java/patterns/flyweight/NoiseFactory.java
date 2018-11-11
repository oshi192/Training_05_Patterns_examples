package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NoiseFactory {
    private static final Map<String, Noise> creatures = new HashMap<>();

    public Noise getNoiseByCreature(String animal) {
        Noise noise = creatures.get(animal);
        if (noise == null) {
            switch (animal) {
                case "Cat":
                    System.out.println("Create new Cat ...");
                    noise = new Cat();
                    break;
                case "Dog":
                    System.out.println("Create new Dog ...");
                    noise = new Dog();
                    break;
            }
            creatures.put(animal, noise);
        }
        return noise;
    }
}
