package me.gicheol.designpattern.decorator.condiment;

import me.gicheol.designpattern.decorator.Beverage;
import me.gicheol.designpattern.decorator.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }

    @Override
    public Integer cost() {
        return 1500 + beverage.cost();
    }

}
