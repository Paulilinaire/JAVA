package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Product implements Subject {

    private int stockLevel;

    List<Observer> observers;

    public Product(){observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int newStockLevel) {
        observers.forEach(o -> o.update(stockLevel));

    }

    public void setStockLevel(int newStockLevel) {
        if (newStockLevel != stockLevel) {
            stockLevel = newStockLevel;
            notifyObservers(newStockLevel);
        }
    }


}
