package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage extends PageObject {
    public static final Target ADD_PRODUCT = Target.the("Añadir producto al carrito").locatedBy("//*[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target SHOPPING_CART = Target.the("obtener datos carrito").locatedBy("//*[@id='shopping_cart_container']/a");
    public static final Target CHECKOUT = Target.the("Revisar detalles información cliente").locatedBy("//*[@id='checkout']");
    public static final Target FIRST_NAME = Target.the("añadir nombre").locatedBy("//*[@id='first-name']");
    public static final Target LAST_NAME = Target.the("añadir apellido").locatedBy("//*[@id='last-name']");
    public static final Target POSTAL_CODE = Target.the("añadir codigo postal").locatedBy("//*[@id='postal-code']");
    public static final Target CONTINUE = Target.the("clic continuar con el proceso de compra").locatedBy("//*[@id='continue']");
    public static final Target FINISH = Target.the("finalizar proceso de compra").locatedBy("//*[@id='finish']");
    public static final Target CHECKOUT_COMPLETE = Target.the("campo para validar si la compra se hizo correctamente").locatedBy("//*[@id='header_container']/div[2]/span");
    public static final Target ADD_PRODUCT_SHOPPING_CART = Target.the("Carrito incrementacion prroducto").locatedBy("//*[@id='shopping_cart_container']/a/span");
    public static final Target PRICE_MAX = Target.the("Guarda el precio del producto con el precio mayor").locatedBy("//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/div");
}
