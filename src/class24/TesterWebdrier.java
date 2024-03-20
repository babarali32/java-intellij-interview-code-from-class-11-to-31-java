package class24;

public class TesterWebdrier {
    public static void main(String[] args) {
        chromedrivers obj = new chromedrivers();
        obj.openbrowser();
        obj.findelement();
        obj.closebrowser();
        System.out.println("----------------------------------");
        webdrivers[] all = {new chromedrivers(), new firefox()};
        for (webdrivers sum : all) {
            sum.openbrowser();
            sum.findelement();
            sum.closebrowser();
            sum.maximizebrowser();
        }
    }
}

interface webdrivers {
    void openbrowser();
    void closebrowser();
    void maximizebrowser();
    void findelement();
}

class chromedrivers implements webdrivers {
    @Override
    public void openbrowser() {
        System.out.println(" open chrome webdriver");
    }

    @Override
    public void closebrowser() {
        System.out.println("close the chrome browser");
    }

    @Override
    public void maximizebrowser() {
        System.out.println("maximize the chrome browser");
    }

    @Override
    public void findelement() {
        System.out.println("fine the welcome element on chrome browser");
    }
}

class firefox implements webdrivers {
    @Override
    public void openbrowser() {
        System.out.println(" open browser in firefox");
    }

    @Override
    public void closebrowser() {
        System.out.println(" close browser of firefox");
    }

    @Override
    public void maximizebrowser() {
        System.out.println("maximize the browser of firefox");
    }

    @Override
    public void findelement() {
        System.out.println(" find the search button ");
    }
}
