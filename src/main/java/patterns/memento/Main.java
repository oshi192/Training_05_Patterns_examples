package patterns.memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Repo repo = new Repo();

        System.out.println("Creating new Progect version 1.0");
        project.setVersionAndDate("version 1.0");
        System.out.println(project);
        System.out.println("Saving current version to repo");
        repo.setSave(project.save());
        System.out.println("Updating progect to version 1.1" );
        System.out.println("writing poor code...");
        Thread.sleep(5000);
        project.setVersionAndDate("version 1.1");
        System.out.println(project);
        System.out.println("Something went wrong...");
        System.out.println("Rolling back to 1.0");
        project.loadSave(repo.getSave());
        System.out.println("Project after roll back:");
        System.out.println(project);
    }
}
