package class21;

public class Testerwebdriver {
    public static void main(String[] args) {

        webdriver [] obj={new googlechrome(),new safari(),new firefox()};
        for (webdriver all:obj
             ) {
            all.click();
            all.closebrowser();
            all.enterpassword();
            all.login();
            all.openwebsite();
            all.click();
        }
    }
}
