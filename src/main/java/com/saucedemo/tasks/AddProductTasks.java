package com.saucedemo.tasks;

import com.saucedemo.userinterface.ProductsUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProductTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginTasks.info());
        actor.wasAbleTo(Click.on(ProductsUserinterface.ADD_PRODUCT));
        actor.wasAbleTo(Click.on(ProductsUserinterface.SHOPPING_CART));

    }
    public static Performable info(){
        return Tasks.instrumented(AddProductTasks.class);
    }
}
