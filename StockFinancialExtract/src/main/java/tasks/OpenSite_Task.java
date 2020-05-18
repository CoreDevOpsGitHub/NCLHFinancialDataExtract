package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static user_interface.HomePage.SEARCH_BAR;
import static user_interface.HomePage.YAHOO_FINANCE_LOGO;

public class OpenSite_Task implements Task {

    private String url;

    public OpenSite_Task(String url)
    {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.url(url),


                WaitUntil.the(YAHOO_FINANCE_LOGO, isVisible()),
                WaitUntil.the(SEARCH_BAR, isVisible())
        );
    }

    public static OpenSite_Task to(String url)
    {

        return Tasks.instrumented(OpenSite_Task.class,url);
    }


}
