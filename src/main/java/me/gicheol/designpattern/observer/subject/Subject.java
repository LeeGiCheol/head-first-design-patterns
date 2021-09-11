package me.gicheol.designpattern.observer.subject;

import me.gicheol.designpattern.observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
