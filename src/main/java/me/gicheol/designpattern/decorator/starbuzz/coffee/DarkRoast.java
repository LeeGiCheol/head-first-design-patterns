package me.gicheol.designpattern.decorator.starbuzz.coffee;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    public Integer cost() {
        return 2500;
    }

}
