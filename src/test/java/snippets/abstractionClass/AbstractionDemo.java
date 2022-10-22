package java.snippets.abstractionClass;

class AbstractionDemo {
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openDefaultHomePage();

    }
}

abstract class WebBrowser {
    // regular method
    // abstract methods

    public void openPage(String pageUrl) {
        System.out.println(pageUrl + " is opened");
    }

    abstract public String getBrowserName();
    abstract public void openDefaultHomePage();

}

class ChromeBrowser extends WebBrowser {

    String browserName = "chrome";

    public String getBrowserName() {
        return browserName;
    }

    public void openDefaultHomePage() {
        System.out.println("google.com");
    }

}

class IE11Browser extends WebBrowser {

    String browserName = "IE11";

    public String getBrowserName() {
        return browserName;
    }

    public void openDefaultHomePage() {
        System.out.println("microsoft.com");
    }

}
