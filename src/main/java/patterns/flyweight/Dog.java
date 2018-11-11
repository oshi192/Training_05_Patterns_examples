package patterns.flyweight;

public class Dog implements Noise {
    @Override
    public void noise() {
        System.out.println("Woof...");
    }
}
