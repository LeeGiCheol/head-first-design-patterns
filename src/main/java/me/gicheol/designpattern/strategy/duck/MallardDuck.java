package me.gicheol.designpattern.strategy.duck;

import me.gicheol.designpattern.strategy.fly.FlyWithWings;
import me.gicheol.designpattern.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("청둥오리입니다.");
    }

}
