package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class BuyPage extends PageObject {
    public static final Target PRICE = Target.the("guardar el porcentaje del producto")
            .locatedBy("//*[@id='checkout_summary_container']/div/div[2]/div[5]");

    public static final Target TAX = Target.the("guarda el tax del producto")
            .locatedBy("//*[@id='checkout_summary_container']/div/div[2]/div[6]");

    public static final Target TOTAL = Target.the("Costo total de la compra")
            .locatedBy("//*[@id='checkout_summary_container']/div/div[2]/div[7]");

//Item total
      //      <div class="summary_subtotal_label">Item total: $29.99</div>
    //*[@id="checkout_summary_container"]/div/

  //  Tax
  //  <div class="summary_tax_label">Tax: $2.40</div>
    //*[@id="checkout_summary_container"]/div/div[2]/div[6]


    //    Total
   // <div class="summary_total_label">Total: $32.39</div>
    //*[@id="checkout_summary_container"]/div/div[2]/div[7]






}
