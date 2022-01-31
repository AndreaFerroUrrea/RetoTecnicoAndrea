package com.saucedemo.tasks;

import com.saucedemo.interactions.Wait;
import com.saucedemo.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PurchaseProductTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(ProductsPage.ADD_PRODUCT));
        actor.attemptsTo(Wait.object());
        actor.wasAbleTo(Click.on(ProductsPage.SHOPPING_CART));
        actor.attemptsTo(Wait.object());
        actor.wasAbleTo(Click.on(ProductsPage.CHECKOUT));
        actor.attemptsTo(Wait.object());
        actor.wasAbleTo(Enter.keyValues("Andrea").into(ProductsPage.FIRST_NAME));
        actor.attemptsTo(Wait.object());
        actor.wasAbleTo(Enter.keyValues("Ferro").into(ProductsPage.LAST_NAME));
        actor.attemptsTo(Wait.object());
        actor.wasAbleTo(Enter.keyValues("Aranjuez").into(ProductsPage.POSTAL_CODE));
        actor.attemptsTo(Wait.object());
        actor.wasAbleTo(Click.on(ProductsPage.CONTINUE));
        actor.attemptsTo(Wait.object());
        actor.wasAbleTo(Click.on(ProductsPage.FINISH));
        actor.attemptsTo(Wait.object());
    }
    public static Performable info(){
        return Tasks.instrumented(PurchaseProductTasks.class);
    }
}
