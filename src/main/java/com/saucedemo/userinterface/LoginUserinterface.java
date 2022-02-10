package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginUserinterface extends PageObject {
    public static final Target USER_NAME = Target.the("ingresa usuario").locatedBy("//*[@id='user-name']");
    public static final Target PASSWORD = Target.the("Ingresa Contraseña").locatedBy("//*[@id='password']");
    public static final Target LOGIN = Target.the("ingresa").locatedBy("//*[@id='login-button']");
}
