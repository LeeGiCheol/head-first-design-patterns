package me.gicheol.designpattern.decorator.starbuzz.condiment;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;
import me.gicheol.designpattern.decorator.starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public Integer cost() {
        return 500 + beverage.cost();
    }

}
