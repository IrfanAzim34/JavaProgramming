package day45_Abstraction.browserTask;

public class Test {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("www.google.com");
        chromeDriver.findElement("a");
        chromeDriver.findElements("input");
        chromeDriver.takeScreenShot();
        chromeDriver.executeScript("JavaScript");
        chromeDriver.getTitle();
        chromeDriver.close();
        chromeDriver.quit();

    }

}
