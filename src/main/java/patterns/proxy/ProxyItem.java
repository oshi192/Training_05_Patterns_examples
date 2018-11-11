package patterns.proxy;

public class ProxyItem implements Item{
    private String stuffName;
    private RealItem realItem;

    ProxyItem(String stuffName){
        this.stuffName = stuffName;
    }

    public void doStuff() {
        if(realItem == null){
            realItem=new RealItem(stuffName);
        }
        realItem.doStuff();
    }
}
