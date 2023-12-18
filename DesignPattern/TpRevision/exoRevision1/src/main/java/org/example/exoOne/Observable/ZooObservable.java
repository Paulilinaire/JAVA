package org.example.exoOne.Observable;

public interface ZooObservable<T> {
    void registerObserver(VisitorObserver<T> observer);
    void removeObserver(VisitorObserver<T> observer);

    void notifyObservers(T element);
}
