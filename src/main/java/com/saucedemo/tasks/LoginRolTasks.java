package com.saucedemo.tasks;

import com.saucedemo.models.DataUser;
import com.saucedemo.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginRolTasks implements Task {

    DataUser dataUser = new DataUser();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Enter.keyValues(dataUser.getUsername()).into(LoginPage.USER_NAME));
        actor.wasAbleTo(Enter.keyValues(dataUser.getPassword()).into(LoginPage.PASSWORD));
        actor.wasAbleTo(Click.on(LoginPage.LOGIN));

    }
}
