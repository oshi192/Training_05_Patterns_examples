package patterns.state;

public class Developer {
    Activity activity;

    public void doIt() {
        activity.doIt();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Training());
        } else if (activity instanceof Training) {
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        } else {
            setActivity(new Sleeping());
        }
    }
}
