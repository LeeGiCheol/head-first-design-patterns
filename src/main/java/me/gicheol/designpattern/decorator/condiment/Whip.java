package me.gicheol.designpattern.decorator.condiment;

import me.gicheol.designpattern.decorator.Beverage;
import me.gicheol.designpattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public Integer cost() {
        return 700 + beverage.cost();
    }

}
