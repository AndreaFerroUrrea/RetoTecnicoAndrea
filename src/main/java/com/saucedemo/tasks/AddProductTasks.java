package com.saucedemo.tasks;

import com.saucedemo.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProductTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(ProductsPage.ADD_PRODUCT));
        actor.wasAbleTo(Click.on(ProductsPage.SHOPPING_CART));

    }
    public static Performable info(){
        return Tasks.instrumented(AddProductTasks.class);
    }
}
