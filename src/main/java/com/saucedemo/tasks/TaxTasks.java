package com.saucedemo.tasks;


import com.saucedemo.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TaxTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Click.on(ProductsPage.ADD_PRODUCT));
        actor.wasAbleTo(Click.on(ProductsPage.SHOPPING_CART));
        actor.wasAbleTo(Click.on(ProductsPage.CHECKOUT));
        actor.wasAbleTo(Enter.keyValues("Andrea").into(ProductsPage.FIRST_NAME));
        actor.wasAbleTo(Enter.keyValues("Ferro").into(ProductsPage.LAST_NAME));
        actor.wasAbleTo(Enter.keyValues("Aranjuez").into(ProductsPage.POSTAL_CODE));
        actor.wasAbleTo(Click.on(ProductsPage.CONTINUE));

    }
    public static Performable info(){return Tasks.instrumented(TaxTasks.class);
    }
}
