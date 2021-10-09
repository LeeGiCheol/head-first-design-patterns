package me.gicheol.designpattern.factory.pizza;

import me.gicheol.designpattern.factory.pizza.chicago.ChicagoPizzaStore;
import me.gicheol.designpattern.factory.pizza.newyork.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}
