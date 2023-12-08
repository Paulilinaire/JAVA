package org.example.observable;

public interface CarObservable {
    void registerObserver(PositionCarObserver observer);
    void removeObserver(PositionCarObserver observer);
    void notifyObservers(String position);

}
