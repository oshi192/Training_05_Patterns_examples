package patterns.adapter;

public class AdapterXMLToJSONData extends DataInJSON implements Data {
    public void send() {
        startSending();
    }
}
