package me.gicheol.designpattern.decorator.coffee;

import me.gicheol.designpattern.decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public Integer cost() {
        return 3500;
    }
}
