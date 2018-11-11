package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                new SeniorJavaDev(
                        new SeniorJavaDev(
                                new JavaDev()
                        )
                )
        );

        System.out.println(developer.makeJob());
    }
}
