package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bdd.utility.SelenuimUtillity;

public class SetupTestSteps extends SelenuimUtillity {

    @Given("Open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
        setUpBrowser();
    }

    @Then("Validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
        String text = getElementText(By.className("top-nav__logo"));

        System.out.println(text);

    }

    @Then("Close browser")
    public void closeBrowser(){
        quitBrowser();
    }



}
