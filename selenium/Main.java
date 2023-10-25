import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Augmenter;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws MalformedURLException {
    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver = new RemoteWebDriver(new URL("http://eugenia:4444"), chromeOptions);
    driver = new Augmenter().augment(driver);
    driver.get("http://www.google.com");
    try {
    File srcFile = ((TakesScreenshot) driver)
        .getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcFile, new File("./01.png"));
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println(driver.getTitle());
    driver.quit();
  }
}
