package org.example.interfaces;

import org.example.classes.Product;

@FunctionalInterface
public interface filterCriteria {
    boolean filter (Product product);
}
