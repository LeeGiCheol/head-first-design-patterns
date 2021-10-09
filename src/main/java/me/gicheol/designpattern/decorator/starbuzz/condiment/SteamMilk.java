package me.gicheol.designpattern.decorator.starbuzz.condiment;

import me.gicheol.designpattern.decorator.starbuzz.Beverage;
import me.gicheol.designpattern.decorator.starbuzz.CondimentDecorator;

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
