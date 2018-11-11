package patterns.chainOfResponsibility;

public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Send sms to manager" + message);
    }
}
