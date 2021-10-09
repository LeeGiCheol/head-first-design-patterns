package me.gicheol.designpattern.decorator.condiment;

import me.gicheol.designpattern.decorator.Beverage;
import me.gicheol.designpattern.decorator.CondimentDecorator;

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
