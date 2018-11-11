package patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Simon", "Petrikov", 1043, 1010102010, "email@gmail.com");
        System.out.println("firstPerson:\t" + firstPerson);
        Person secondPerson = (Person) firstPerson.copy();
        firstPerson = null;
        System.out.println("secondPerson:\t" + secondPerson);
    }
}
