package patterns.templatemethod;

import com.sun.xml.internal.bind.v2.WellKnownNamespace;

public class Main {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println();
        newsPage.showPage();
    }
}
