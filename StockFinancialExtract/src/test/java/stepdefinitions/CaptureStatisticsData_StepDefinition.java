package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.CaptureStatistics_Task;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CaptureStatisticsData_StepDefinition {



    @Before
    public void PrepararEscenario()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^The user captures the profit data$")
    public void the_user_captures_the_profit_data()
    {
        // Write code here that turns the phrase above into concrete actions

        theActorInTheSpotlight().attemptsTo(CaptureStatistics_Task.CaptureStatistics_Method());

    }

}
