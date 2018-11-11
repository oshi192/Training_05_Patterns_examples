package patterns.abstractfactory.cocacola;

import patterns.abstractfactory.Cup;

public class CocaColaCup implements Cup {
    @Override
    public void printCollor() {
        System.out.println("Red metal cup");
    }
}
