package patterns.interpreter;

public class OrExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String contex) {
        return expression1.interpret(contex) || expression2.interpret(contex);
    }
}
