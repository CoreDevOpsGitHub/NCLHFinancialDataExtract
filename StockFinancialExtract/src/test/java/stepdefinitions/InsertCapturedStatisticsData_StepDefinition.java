package stepdefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utilities.InsertData;


public class InsertCapturedStatisticsData_StepDefinition {


    @And("^The user inserts data into the database$")
    public void the_user_inserts_data_into_the_database() {

        InsertData insertdata_instance = new InsertData();
        insertdata_instance.InsertDataMethod();

        //theActorInTheSpotlight().attemptsTo(InsertData_Task.InsertData_Method());


    }

    @Then("^The user should see the statistics page loaded$")
    public void theUserShouldSeeTheStatisticsPageLoaded() {


    }
}
