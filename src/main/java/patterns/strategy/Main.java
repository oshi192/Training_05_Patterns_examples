package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setActivity(new Coding());
        person.execute();
        person.setActivity(new Drawing());
        person.execute();
        person.setActivity(new Playing());
        person.execute();
        person.setActivity(new Constructing());
        person.execute();
    }
}
