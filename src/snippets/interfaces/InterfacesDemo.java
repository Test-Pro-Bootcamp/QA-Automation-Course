package snippets.interfaces;

public class InterfacesDemo {


    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openDefaultHomePage();
    }
}

    // WebBrowser
    // Chrome Browser
    // IE11 browser

    interface WebBrowser {
        public String getBrowserName();
        public void openDefaultHomePage();

    }

interface BrowserNavigation {
    public void navigateToPage();
    public void goBack();

}

    class ChromeBrowser implements WebBrowser, BrowserNavigation {

        String browserName = "chrome";

        public String getBrowserName() {
            return browserName;
        }

        public void openDefaultHomePage() {
            System.out.println("google.com");
        }

        public void navigateToPage() {

        }
        public void goBack() {

        }

    }
