package patterns.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String contex) {
        return contex.contains(data)?true:false;
    }
}
