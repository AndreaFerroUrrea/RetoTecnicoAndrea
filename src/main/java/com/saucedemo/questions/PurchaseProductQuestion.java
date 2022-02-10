package com.saucedemo.questions;

import com.saucedemo.userinterface.ProductsUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PurchaseProductQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ProductsUserinterface.CHECKOUT_COMPLETE).viewedBy(actor).asString();
    }
public static PurchaseProductQuestion compare(){
        return new PurchaseProductQuestion();}
}