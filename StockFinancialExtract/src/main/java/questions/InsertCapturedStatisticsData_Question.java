package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interface.HomePage.YAHOO_FINANCE_LOGO;
import static user_interface.StatisticsPage.ReturnOnEquity_WebVariable;

public class InsertCapturedStatisticsData_Question implements Question<Boolean>

{
    @Override
    public Boolean answeredBy(Actor actor)
    {
        return ReturnOnEquity_WebVariable.resolveFor(actor).isVisible();

    }
}
