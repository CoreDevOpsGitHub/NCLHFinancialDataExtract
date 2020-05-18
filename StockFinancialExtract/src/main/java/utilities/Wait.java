package utilities;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Wait implements Interaction {

    private int var;

    public Wait(int var) {
        this.var = var;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        new InternalSystemClock().pauseFor(var);
    }

    public static Wait aTime(int var)

    {
        return instrumented(Wait.class, var);
    }
}
