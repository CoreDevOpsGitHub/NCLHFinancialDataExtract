package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interface.HomePage.YAHOO_FINANCE_LOGO;


public class OpenSite_Question implements Question<Boolean>

{
    @Override
    public Boolean answeredBy(Actor actor)
    {
        return YAHOO_FINANCE_LOGO.resolveFor(actor).isVisible();

    }
}
