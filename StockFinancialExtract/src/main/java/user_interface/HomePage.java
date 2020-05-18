package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {


    public static final Target YAHOO_FINANCE_LOGO = Target.the("Yahoo_Finance_Logo_Tag").located(By.id("header-logo"));
    public static final Target SEARCH_BAR = Target.the("Search_Bar_Tag").located(By.id("yfin-usr-qry"));
    public static final Target SEARCH_BUTTON = Target.the("Search_Button_Tag").located(By.id("header-desktop-search-button"));



}
