package patterns.visitor;

public class Database implements ProjectElement {
    @Override
    public void beWriten(Developer developer) {
        developer.create(this);
    }
}
