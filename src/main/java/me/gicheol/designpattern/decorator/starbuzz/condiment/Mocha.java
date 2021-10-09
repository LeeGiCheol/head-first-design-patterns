package me.gicheol.designpattern.decorator.starbuzz.condiment;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;
import me.gicheol.designpattern.decorator.starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public Integer cost() {
        return 1000 + beverage.cost();
    }

}
