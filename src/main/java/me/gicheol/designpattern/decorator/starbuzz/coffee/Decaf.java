package me.gicheol.designpattern.decorator.starbuzz.coffee;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public Integer cost() {
        return 3500;
    }
}
