package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interface.StockPage.BUY_BUTTON;

public class SearchStockSymbol_Question implements Question<Boolean>

{

    @Override
    public Boolean answeredBy(Actor actor)
    {
        return BUY_BUTTON.resolveFor(actor).isVisible();
    }

    public static SearchStockSymbol_Question BuyButtonAppears()
    {
        return new SearchStockSymbol_Question();
    }


}
