package com.saucedemo.tasks;

import com.saucedemo.userinterface.FilterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FilterTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FilterPage.FILTRO));
        actor.attemptsTo(Click.on(FilterPage.PRICE_LOW_HIGH));
    }
    public static Performable info(){
        return Tasks.instrumented(FilterTasks.class);
    }
}
