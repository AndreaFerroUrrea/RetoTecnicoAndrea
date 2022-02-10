package com.saucedemo.tasks;

import com.saucedemo.userinterface.ProductsUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PurchaseProductTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(ProductsUserinterface.ADD_PRODUCT));
        actor.wasAbleTo(Click.on(ProductsUserinterface.SHOPPING_CART));
        actor.wasAbleTo(Click.on(ProductsUserinterface.CHECKOUT));
        actor.wasAbleTo(Enter.keyValues("Andrea").into(ProductsUserinterface.FIRST_NAME));
        actor.wasAbleTo(Enter.keyValues("Ferro").into(ProductsUserinterface.LAST_NAME));
        actor.wasAbleTo(Enter.keyValues("Aranjuez").into(ProductsUserinterface.POSTAL_CODE));
        actor.wasAbleTo(Click.on(ProductsUserinterface.CONTINUE));
        actor.wasAbleTo(Click.on(ProductsUserinterface.FINISH));

    }

    public static Performable info() {
        return Tasks.instrumented(PurchaseProductTasks.class);
    }
}
