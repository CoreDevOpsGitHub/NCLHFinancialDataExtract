package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StockPage {

    public static final Target STATISTICS_TAB = Target.the("Statisctics_Tab_Tag").
            located(By.xpath("//li[@data-test='STATISTICS']/a/span"));

    public static final Target BUY_BUTTON = Target.the("Buy_Button_Tag").
            located(By.xpath("//span[contains(text(),'Buy')]"));


//span[@class='title']


}
