package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import tasks.OpenSite_Task;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utilities.OpenSite_Utilities.URL;




public class OpenSite_StepDefinition {



    @Before
    public void PrepararEscenario()
    {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user goes to the login page$")
    public void theUserGoesToTheLoginPage() {
        // THE USER WILL OPEN THE WEBPAGE
        theActorCalled("The User").wasAbleTo(OpenSite_Task.to(URL));

    }

    @Then("^The user will see the company logo$")
    public void theUserWillSeeTheCompanyLogo() {
        // THE YAHOO FINANCE LOGO WILL APPEAR

      //  theActorInTheSpotlight().should(seeThat(dashboard_months_validation_Question.monthsExist(monthsValidate)));

    }

}
