package me.gicheol.designpattern.decorator.starbuzz.condiment;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;
import me.gicheol.designpattern.decorator.starbuzz.CondimentDecorator;

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
