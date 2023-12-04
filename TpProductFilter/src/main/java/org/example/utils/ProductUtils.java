package org.example.utils;

import org.example.classes.Product;
import org.example.interfaces.filterCriteria;

import java.util.ArrayList;
import java.util.List;

public class ProductUtils {

    public static List<Product> filterProducts(List<Product> allProducts, filterCriteria criteria) {
        List<Product> filteredProducts = new ArrayList<>();

        for (Product p : allProducts) {
            if (criteria.filter(p)) {
                filteredProducts.add(p);
            }
        }

        return filteredProducts;
    }
}
