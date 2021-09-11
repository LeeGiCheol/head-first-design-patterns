package me.gicheol.designpattern.strategy.duck;

import me.gicheol.designpattern.strategy.fly.FlyNoWay;
import me.gicheol.designpattern.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }

}
