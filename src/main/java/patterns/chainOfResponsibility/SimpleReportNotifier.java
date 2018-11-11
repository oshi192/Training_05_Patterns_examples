package patterns.chainOfResponsibility;

public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority){
        super(priority);
    }

    public void write(String message) {
        System.out.println("Nothing using simple reports: "+message);
    }
}
