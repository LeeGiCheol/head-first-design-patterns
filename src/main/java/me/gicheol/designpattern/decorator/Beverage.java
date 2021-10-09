package me.gicheol.designpattern.decorator;

public abstract class Beverage {

    protected String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract Integer cost();

}
