package patterns.visitor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer jun = new JuniorDev();
        Developer sen = new SeniorDev();

        System.out.println("Junior in action...");
        project.beWriten(jun);
        System.out.println("Senior in action...");
        project.beWriten(sen);
    }
}
