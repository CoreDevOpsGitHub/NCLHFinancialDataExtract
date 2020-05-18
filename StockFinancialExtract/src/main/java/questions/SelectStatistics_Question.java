package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interface.StatisticsPage.ValuationMeasures_Header;


public class SelectStatistics_Question implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor)
    {
        return ValuationMeasures_Header.resolveFor(actor).isVisible();
    }

    public static SelectStatistics_Question ValidationMeasureAppears_Method()
    {
        return new SelectStatistics_Question();
    }

}
