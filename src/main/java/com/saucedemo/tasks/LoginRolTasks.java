package com.saucedemo.tasks;

import com.saucedemo.userinterface.LoginPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

@AllArgsConstructor
public class LoginRolTasks implements Task {

    private final Map<String, String> userData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(userData.get("username")).into(LoginPage.USER_NAME));
        actor.attemptsTo(Enter.keyValues(userData.get("password")).into(LoginPage.PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.LOGIN));
    }
    public static Performable info(Map<String, String> userData){
        return Tasks.instrumented(LoginRolTasks.class,userData);
    }
}
