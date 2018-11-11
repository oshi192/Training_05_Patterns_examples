package patterns.strategy;

public class Person {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute(){
        activity.doIt();
    }
}
