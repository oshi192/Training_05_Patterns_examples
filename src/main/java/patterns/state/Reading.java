package patterns.state;

public class Reading implements Activity {
    @Override
    public void doIt() {
        System.out.println("Reading book ...");
    }
}
