package patterns.oreilly.observer.self_implemented.subject;

import patterns.oreilly.observer.self_implemented.concrete_observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
