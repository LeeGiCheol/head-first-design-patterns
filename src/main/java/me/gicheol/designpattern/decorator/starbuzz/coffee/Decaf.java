package me.gicheol.designpattern.decorator.starbuzz.coffee;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public Integer cost() {
        return 3500;
    }
}
