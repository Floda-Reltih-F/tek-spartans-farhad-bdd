package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetUp {

    // Encapsulating web driver instance
    private static WebDriver driver;
    public void setUpBrowser(){

        // web Driver instance
        // navigation to retail app
        // maximise
        // and implicitly wait

        driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void quitBrowser(){
        // null check before quit
        if(driver != null ) {
            driver.quit();
        }

    }

    // giving read-only indirect access to driver
    // restricting setting mew driver
    public static WebDriver getDriver() {
        return driver;
    }
}
