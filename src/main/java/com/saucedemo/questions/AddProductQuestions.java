package com.saucedemo.questions;

import com.saucedemo.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class AddProductQuestions implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ProductsPage.ADD_PRODUCT_SHOPPING_CART).viewedBy(actor).asString();
    }
    public static  AddProductQuestions compare(){
        return new AddProductQuestions();
    }
}
