package patterns.templatemethod;

public class NewsPage extends WebSiteTemplate {
    @Override
    public void showPageContant() {
        System.out.println("News");
    }
}
