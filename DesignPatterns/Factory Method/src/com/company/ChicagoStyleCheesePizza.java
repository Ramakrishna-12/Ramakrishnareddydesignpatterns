package com.company;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza int ro square slices");
    }
}
