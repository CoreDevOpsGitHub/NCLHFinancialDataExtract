package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.InsertData;

import java.util.concurrent.TimeUnit;

import static user_interface.StatisticsPage.*;

public class CaptureStatistics_Task implements Task {

    public String ProfitMargin_DataVariable;
    public String OperatingMargin_DataVariable;
    public String ReturnOnAssets_DataVariable;
    public String ReturnOnEquity_DataVariable;
    public String StockTicker_DataVariable;



    @Override
    public <T extends Actor> void performAs(T actor)

    {



        //actor.remember("OperatingMargin_DataVariable_actorremember", OperatingMargin_DataVariable);
        OperatingMargin_DataVariable = OperatingMargin_WebVariable.resolveFor(actor).getText();
        ProfitMargin_DataVariable = ProfitMargin_WebVariable.resolveFor(actor).getText();
        ReturnOnAssets_DataVariable = ReturnOnAssets_WebVariable.resolveFor(actor).getText();
        ReturnOnEquity_DataVariable = ReturnOnEquity_WebVariable.resolveFor(actor).getText();
        StockTicker_DataVariable = StockTicker_WebVariable.resolveFor(actor).getText();


        actor.remember("OperatingMargin",OperatingMargin_DataVariable);
        actor.remember("ProfitMargin",ProfitMargin_DataVariable);
        actor.remember("ReturnOnAssets",ReturnOnAssets_DataVariable);
        actor.remember("ReturnOnEquity",ReturnOnEquity_DataVariable);
        actor.remember("StockTicker",StockTicker_DataVariable);

        //We want to send the variable OperatingMargin_DataVariable & ProfitMargin_DataVariable to another class to be used
        //In order to do this we will Call the Class we want to send it to...and the return method name...plus the variables we want to send
        //CLASSNAME....Methodname...Variables to send
        //actor.attemptsTo(InsertCapturedStatisticsData_Task.receive_capturedstatistics_task_method(ProfitMargin_DataVariable,
          //      OperatingMargin_DataVariable));


        System.out.println("\033[37;44;1m This is the ProfitMargin_DataVariable :"+ProfitMargin_DataVariable);
        System.out.println("\033[37;44;1m This is the OperatingMargin_DataVariable :"+OperatingMargin_DataVariable);
        System.out.println("\033[37;44;1m This is the ReturnOnAssets_DataVariable :"+ReturnOnAssets_DataVariable);
        System.out.println("\033[37;44;1m This is the ReturnOnEquity_DataVariable :"+ReturnOnEquity_DataVariable);
        System.out.println("\033[37;44;1m This is the StockTicker_DataVariable :"+StockTicker_DataVariable);


        //List<List<String>> rawData = Arrays.asList(Arrays.asList(OperatingMargin_DataVariable,ProfitMargin_DataVariable));
        //DataTable CompanyValues = DataTable.create(rawData);
        // System.out.println(CompanyValues);

    }




    public static CaptureStatistics_Task CaptureStatistics_Method() {
        return Tasks.instrumented(CaptureStatistics_Task.class);
    }

}
