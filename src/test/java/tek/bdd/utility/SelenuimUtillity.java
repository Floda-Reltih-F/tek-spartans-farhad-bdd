package tek.bdd.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetUp;

import java.time.Duration;

public class SelenuimUtillity extends BaseSetUp {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    private WebElement waitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // create a methode to click on a given locator
   public void clickOnElement(By locator){
    getWait().until(ExpectedConditions.elementToBeClickable(locator))
            .click();

   }

   public void sendText(By locator, String value){
      getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
              .click();
   }

   // method for getting the text of a locator

    public String getElementText(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();

   }






}
