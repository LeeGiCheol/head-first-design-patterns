package me.gicheol.designpattern.java_api_observer.subject;

import me.gicheol.designpattern.java_api_observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
