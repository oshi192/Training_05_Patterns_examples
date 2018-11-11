package patterns.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWriten(Developer developer) {
        for (ProjectElement e : projectElements) {
            e.beWriten(developer);
        }
    }
}
