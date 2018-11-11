package patterns.templatemethod;

public class WelcomePage extends WebSiteTemplate {
    @Override
    public void showPageContant() {
        System.out.println("Welcome");
    }
}
