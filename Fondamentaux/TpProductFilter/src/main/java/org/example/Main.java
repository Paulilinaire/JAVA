package org.example;

import org.example.classes.Product;
import org.example.enums.Categories;
import org.example.utils.ProductUtils;
import java.util.Arrays;
import java.util.List;

    public class Main {

        public static void main(String[] args) {
            List<Product> allProducts = Arrays.asList(
                    new Product("Laptop", 799.99,Categories.ELECTRONICS),
                    new Product("T-shirt", 15.99,Categories.CLOTHING),
                    new Product("Cereal Box", 4.49, Categories.FOOD),
                    new Product("Smartphone", 499.99, Categories.ELECTRONICS)
            );

            List<Product> filteredProductsByPrice = ProductUtils.filterProducts(allProducts, product -> product.getPrice() < 20.0);
            System.out.println(filteredProductsByPrice);
            List<Product> electronicProductList = ProductUtils.filterProducts(allProducts, product -> product.getCategories() == Categories.ELECTRONICS);
            System.out.println(electronicProductList);

            System.out.println(allProducts.stream().filter(p -> p.getPrice() > 50));
            allProducts.forEach(System.out::println);

        }


}
