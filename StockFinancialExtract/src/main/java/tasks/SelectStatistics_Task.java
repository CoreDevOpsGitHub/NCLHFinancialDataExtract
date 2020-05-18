package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static user_interface.StatisticsPage.ValuationMeasures_Header;
import static user_interface.StockPage.STATISTICS_TAB;

public class SelectStatistics_Task implements Task {




    @Override
    public <T extends Actor> void performAs(T actor)
    {

        WaitUntil.the(STATISTICS_TAB, isCurrentlyEnabled());
        actor.attemptsTo(Click.on(STATISTICS_TAB));

        System.out.println("\033[37;44;1m This is the stats tab  :"+STATISTICS_TAB);

        System.out.println("\033[37;44;1m This is the stats tab  :"+ ValuationMeasures_Header);

    }


    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

    public static SelectStatistics_Task SelectStatisticsTab () {
        return Tasks.instrumented(SelectStatistics_Task.class);
    }



}
