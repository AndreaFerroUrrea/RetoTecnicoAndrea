package com.saucedemo.tasks;

import com.saucedemo.interactions.Wait;
import com.saucedemo.userinterface.MenuUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class MenuTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuUserinterface.BTN_MENU));
        actor.attemptsTo(Wait.object());
        actor.attemptsTo(Click.on(MenuUserinterface.RESET_SIDEBAR));
        actor.attemptsTo(Wait.object());
    }
    public static Performable info(){
        return Tasks.instrumented(MenuTasks.class);
    }
}
