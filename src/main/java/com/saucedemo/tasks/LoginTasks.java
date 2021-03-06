package com.saucedemo.tasks;

import com.saucedemo.userinterface.LoginUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Enter.keyValues("standard_user").into(LoginUserinterface.USER_NAME));
        actor.wasAbleTo(Enter.keyValues("secret_sauce").into(LoginUserinterface.PASSWORD));
        actor.wasAbleTo(Click.on(LoginUserinterface.LOGIN));
    }
    public static Performable info(){
        return Tasks.instrumented(LoginTasks.class);
    }
}
