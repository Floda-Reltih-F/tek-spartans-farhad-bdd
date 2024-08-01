package tek.bdd.steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SelenuimUtillity;

public class HooksSteps extends SelenuimUtillity {
    @Before
    public void beforeEachScenario(){
        setUpBrowser();
    }

    @After
    public void afterEachScenario(){
        quitBrowser();
    }


}
