package patterns.proxy;

public class Main {
    public static void main(String[] args) {
        Item item = new ProxyItem("table");
        item.doStuff();
    }
}
