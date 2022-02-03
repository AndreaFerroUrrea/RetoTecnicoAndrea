package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage extends PageObject {
    public static final Target BTN_MENU = Target.the("Boton para abrir el menu").locatedBy("//*[@id='react-burger-menu-btn']");
    public static final Target RESET_SIDEBAR = Target.the("seleccionar la opcion resetear").locatedBy("//*[@id='reset_sidebar_link']");

}
