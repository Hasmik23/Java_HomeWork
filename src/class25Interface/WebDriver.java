package class25Interface;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(),maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.*/

   void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver interface WebDriver {  //only the class that have same file name can have public
    @Override
       void openBrowser(){
        System.out.println("Open Browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("close Browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximize Window");
    }
    @Override
    public void findElement(){
        System.out.println("Find Element");
    }


class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Element");
    }


    public static void main(String[] args) {

        WebDriver[] webdriver = new WebDriver();
        for (WebDriver wd : webdriver) {
            wd.openBrowser();
            wd.closeBrowser();
            wd.findElement();
            wd.maximizeWindow();
        }
    }
}
}