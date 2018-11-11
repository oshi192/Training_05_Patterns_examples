package patterns.memento;

public class Repo {
    private Save save;

    public Save getSave() {
        return this.save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
