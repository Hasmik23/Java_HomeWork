package Project2;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver[] browsers={new SafariDriver(), new FirefoxDriver(),new ChromeDriver()};

        for(WebDriver browser:browsers){
            browser.open();
            browser.close();
            browser.getTitle();

        }

    }
}
