package me.gicheol.designpattern.strategy;

import me.gicheol.designpattern.strategy.duck.Duck;
import me.gicheol.designpattern.strategy.duck.MallardDuck;
import me.gicheol.designpattern.strategy.duck.ModelDuck;
import me.gicheol.designpattern.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        System.out.println("=========청둥오리=========");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("========================");

        System.out.println("=========모형오리=========");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println("========================");

    }

}
