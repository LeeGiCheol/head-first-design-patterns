package me.gicheol.designpattern.decorator.starbuzz.coffee;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public Integer cost() {
        return 1500;
    }

}
