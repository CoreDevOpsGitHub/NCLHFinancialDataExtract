package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static user_interface.HomePage.SEARCH_BAR;
import static user_interface.HomePage.SEARCH_BUTTON;
import static user_interface.StockPage.BUY_BUTTON;
import static user_interface.StockPage.STATISTICS_TAB;

public class SearchStockSymbol_Task implements Task {

    private String stocksymbol;


    public SearchStockSymbol_Task(String stocksymbol) {
        this.stocksymbol = stocksymbol;

    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.remember("StockSymbol_Tag",stocksymbol);
        actor.attemptsTo(
                Enter.theValue(stocksymbol).into(SEARCH_BAR),
                Click.on(SEARCH_BUTTON)

                //WaitUntil.the(BUY_BUTTON, isVisible()),
                //WaitUntil.the(STATISTICS_TAB, isVisible())


        );
    }


    public static SearchStockSymbol_Task InsertStockSymbol (String stocksymbol) {
        return Tasks.instrumented(SearchStockSymbol_Task.class, stocksymbol);
    }





}
