package com.saucedemo.questions;

import com.saucedemo.userinterface.ProductsUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AddProductQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ProductsUserinterface.ADD_PRODUCT_SHOPPING_CART).viewedBy(actor).asString();
    }
    public static AddProductQuestion compare(){
        return new AddProductQuestion();
    }
}
