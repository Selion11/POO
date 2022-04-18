package Primer_Parcial;

import static Primer_Parcial.PizzaType.*;
import static Primer_Parcial.Topping.*;

public class PizzaTester {
    public static void main(String[] args) {
        // Pizza a la parrilla con Tomate

        Pizza pizza1 = new Pizza(GRILL, new Topping[]{TOMATO});
        // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Pizza pizza2 = new Pizza(GRILL,new Topping[]{ONIONS,EXTRA_CHEESE} );
        // Pizza al horno con Cebolla con Extra queso
        Pizza pizza3 = new Pizza(OVEN,new Topping[]{ONIONS,EXTRA_CHEESE});
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }


}
