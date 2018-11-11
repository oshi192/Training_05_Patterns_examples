package patterns.state;

public class Sleeping implements Activity {
    @Override
    public void doIt() {
        System.out.println("Sleeping ...");
    }
}
