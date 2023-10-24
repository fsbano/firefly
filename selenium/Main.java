import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws MalformedURLException {
    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver = new RemoteWebDriver(new URL("http://eugenia:4444"), chromeOptions);
    driver.get("http://www.google.com");
    System.out.println(driver.getTitle());
    driver.quit();
  }
}
