package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StatisticsPage {

    public static final Target ValuationMeasures_Header = Target.the("ValuationMeasures_Header_Tag").
            located(By.xpath("//span[contains(text(),'Valuation Measures')]"));


    public static final Target ProfitMargin_WebVariable = Target.the("ProftMargin_Value_Tag").
            located(By.xpath("(//td[@class='Fw(500) Ta(end) Pstart(10px) Miw(60px)'])[31]"));

    public static final Target OperatingMargin_WebVariable = Target.the("OperatingMargin_Value_Tag").
            located(By.xpath("(//td[@class='Fw(500) Ta(end) Pstart(10px) Miw(60px)'])[32]"));

    public static final Target ReturnOnAssets_WebVariable = Target.the("ReturnOnAssets_Value_Tag").
            located(By.xpath("(//td[@class='Fw(500) Ta(end) Pstart(10px) Miw(60px)'])[33]"));

    public static final Target ReturnOnEquity_WebVariable = Target.the("ReturnOnEquity_Value_Tag").
            located(By.xpath("(//td[@class='Fw(500) Ta(end) Pstart(10px) Miw(60px)'])[34]"));

    public static final Target ReturnOnRevenue_WebVariable = Target.the("Revenue_Value_Tag").
            located(By.xpath("(//td[@class='Fw(500) Ta(end) Pstart(10px) Miw(60px)'])[35]"));

    public static final Target StockTicker_WebVariable = Target.the("Stock_Ticker_Tag").
            located(By.xpath("//*[@id=\"quote-header-info\"]/div[2]/div[1]/div[1]/h1"));
    //span[contains(text(),'Valuation Measures')]
}
