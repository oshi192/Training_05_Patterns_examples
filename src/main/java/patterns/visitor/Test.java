package patterns.visitor;

public class Test implements ProjectElement {
    @Override
    public void beWriten(Developer developer) {
        developer.create(this);
    }
}
