package patterns.proxy;

public class RealItem implements Item {
    private String stuffName;

    RealItem(String stuffName){
        this.stuffName = stuffName;
        doAnotherStuff();
    }

    public void doAnotherStuff(){
        System.out.println("Prepare do some with " + stuffName);
    }

    public void doStuff() {
        System.out.println("Do some with " + stuffName);
    }
}
