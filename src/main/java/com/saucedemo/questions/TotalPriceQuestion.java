package com.saucedemo.questions;

import com.saucedemo.userinterface.BuyUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TotalPriceQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(BuyUserinterface.TOTAL).viewedBy(actor).asString();
    }
    public static TotalPriceQuestion compare(){
        return new TotalPriceQuestion();
    }
}
