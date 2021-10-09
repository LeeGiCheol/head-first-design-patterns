package me.gicheol.designpattern.decorator.coffee;

import me.gicheol.designpattern.decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public Integer cost() {
        return 1500;
    }

}
