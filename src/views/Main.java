package views;

import model.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Milk tea", 35000));
        products.add(new Product(1, "Milk tea", 35000));
        products.add(new Product(1, "Milk tea", 35000));
        products.add(new Product(1, "Milk tea", 35000));
        for (Product value : products) {
            System.out.println(value);
        }
    }
}