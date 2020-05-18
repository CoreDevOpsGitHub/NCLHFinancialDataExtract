package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.SearchStockSymbol_Question;
import tasks.SearchStockSymbol_Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SearchStockSymbol_StepDefinition {


    @Before
    public void PrepararEscenario()
    {
        OnStage.setTheStage(new OnlineCast());
    }




    @When("^The user enter the stock symbol \"([^\"]*)\"$")
    public void the_user_enter_the_stock_symbol(String stocksymbol) {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(SearchStockSymbol_Task.InsertStockSymbol(stocksymbol));
        //throw new PendingException();
    }


    @Then("^The user can view the buy stock button$")
    public void the_user_can_view_the_buy_stock_button() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(
                seeThat(SearchStockSymbol_Question.BuyButtonAppears(), equalTo(true)));

       // throw new PendingException();
    }


    /*
    @Then("^The user can view the stock data$")
    public void the_user_can_view_the_stock_data() {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
*/




}
