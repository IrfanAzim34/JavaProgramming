package day45_Abstraction.browserTask;

public class RemoteWebDriver implements WebDriver,TakeScreenShot,JavaScriptExecutor{

    private final String browserName;

    public RemoteWebDriver(String browserName) {
        if (browserName == null || browserName.isEmpty() || browserName.isBlank()){
            throw new RuntimeException("Invalid Browser Name: " + browserName);
        }
        this.browserName = browserName;
        System.out.println("Opening " + browserName + " browser");
    }

    public String getBrowserName() {
        return browserName;
    }

    @Override
    public void executeScript(String script) {
        System.out.println("Executing \"" + script + "\" script on " + browserName + " browser");
    }

    @Override
    public void findElement(String locator) {
        System.out.println(browserName + " driver locating an element by " + locator);
    }

    @Override
    public void findElements(String locator) {
        System.out.println(browserName + " driver locating multiple element by " + locator);
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Taking screenshot on: " + browserName + " browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Getting the " + url + " on " + browserName + " browser");
    }

    @Override
    public void close() {
        System.out.println("Closing the tab on " + browserName + " browser");
    }

    @Override
    public void quit() {
        System.out.println("Quitting the " + browserName + " browser");
    }

    @Override
    public void getTitle() {
        System.out.println(browserName + " driver is getting title");
    }
}
