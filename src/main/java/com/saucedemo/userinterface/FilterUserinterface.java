package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class FilterUserinterface extends PageObject {
    public static final Target FILTRO = Target.the("filtro").locatedBy("//*[@id='header_container']/div[2]/div[2]/span/select");


    public static final Target PRICE_LOW_HIGH = Target.the("filtrar precio de mayor a menor").locatedBy("//*[@id='header_container']/div[2]/div[2]/span/select/option[4]");
}
