package patterns.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEdeveloper = getJavaEEExpression();
        System.out.println("Does developer knows javaCore? "+ isJava.interpret("Java Core"));
        System.out.println("Does developer knows javaEE? "+ isJavaEEdeveloper.interpret("Java Spring"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);

    }
}
