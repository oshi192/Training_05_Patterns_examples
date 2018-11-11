package patterns.adapter;

public class Main {
    public static void main(String[] args) {
        //Data data = new DataInXML();
        Data data = new AdapterXMLToJSONData();
        data.send();
    }
}
