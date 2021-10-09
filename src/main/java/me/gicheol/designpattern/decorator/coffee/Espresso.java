package me.gicheol.designpattern.decorator.coffee;

import me.gicheol.designpattern.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public Integer cost() {
        return 2000;
    }

}
