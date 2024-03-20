package class24;
public class testerinterface {
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
    }}