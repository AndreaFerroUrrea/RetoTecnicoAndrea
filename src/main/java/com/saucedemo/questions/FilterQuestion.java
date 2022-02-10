package com.saucedemo.questions;

import com.saucedemo.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FilterQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ProductsPage.PRICE_MAX).viewedBy(actor).asString();
    }
    public static FilterQuestion compare(){
        return new FilterQuestion();
    }
}
