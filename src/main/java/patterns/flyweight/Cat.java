package patterns.flyweight;

import java.awt.image.renderable.ContextualRenderedImageFactory;

public class Cat implements Noise {
    @Override
    public void noise() {
        System.out.println("meaw...");
    }
}
