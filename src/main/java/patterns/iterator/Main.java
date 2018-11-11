package patterns.iterator;

public class Main {
    public static void main(String[] args) {
        String [] skills = {"Java","Spring","Hibernate","Maven","Git","PostgreSql"};

        JavaDev dev = new JavaDev("Peter",skills);

        Iterator iterator = dev.getIterator();
        System.out.println("Developer: "+dev.getName());
        System.out.println("Skills:");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
