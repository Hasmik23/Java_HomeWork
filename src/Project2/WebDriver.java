package Project2;

public class WebDriver {
    /*Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
          ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them*/


    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriverInterface extends WebDriver{
    void navigate();
}

interface TakeScreenShot extends WebDriver{
    void  getScreenShot();
}


class SafariDriver implements WebDriver {
    @Override
    public void open() {
        System.out.println("open Safari browse");
    }

    @Override
    public void close() {
        System.out.println("Close safari browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    public void navigate() {
        System.out.println("Navigate Safari browser");
    }
}


class FirefoxDriver implements WebDriver {
    @Override
    void open() {
        System.out.println("Open fireFox browser");
    }

    @Override
    void close() {
        System.out.println("Close fireFox browser");
    }

    @Override
    String getTitle() {
        return null;
    }

    public void getScreenShot() {
        System.out.println("Get screenshot");
    }
}



    class ChromeDriver implements WebDriver{
        @Override
        void open() {
            System.out.println("Open Chrome browser");
        }

        @Override
        void close() {
            System.out.println("CloseChrome browser");
        }

        @Override
        String getTitle() {
            return null;
        }
    }


