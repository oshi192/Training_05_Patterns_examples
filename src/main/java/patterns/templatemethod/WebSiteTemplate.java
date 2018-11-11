package patterns.templatemethod;

public abstract class WebSiteTemplate {
    public void showPage() {
        System.out.println("header");
        showPageContant();
        System.out.println("Footer");
    }

    public abstract void showPageContant();
}
