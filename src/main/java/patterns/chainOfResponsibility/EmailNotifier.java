package patterns.chainOfResponsibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
