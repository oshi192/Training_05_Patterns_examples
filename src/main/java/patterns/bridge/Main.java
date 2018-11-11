package patterns.bridge;

public class Main {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for(Program p:programs){
            p.developProgram();
        }
    }
}
