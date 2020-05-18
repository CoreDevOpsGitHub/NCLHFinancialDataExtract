package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.SelectStatistics_Question;
import tasks.SelectStatistics_Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SelectStatistics_StepDefinition {


    @Before
    public void PrepararEscenario()
    {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^The user selects the Statistics tab$")
    public void the_user_selects_the_Statistics_tab() {
        // Write code here that turns the phrase above into concrete actions

        theActorInTheSpotlight().attemptsTo(SelectStatistics_Task.SelectStatisticsTab());

        //throw new PendingException();
    }


    @Then("^The valuation measures header appears$")
    public void the_valuation_measures_header_appears()
    {
        theActorInTheSpotlight().should(
                seeThat(SelectStatistics_Question.ValidationMeasureAppears_Method(), equalTo(true)));

    }
}
