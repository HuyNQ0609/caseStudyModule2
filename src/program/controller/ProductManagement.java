package program.controller;

import program.model.Product;

import java.util.*;

public class ProductManagement {
    List<Product> productList;

    public ProductManagement(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    /* Add new product */
    public void addProduct(Product product) {
        productList.add(product);
    }

    /* Edit product */
    public void editProduct(int index, Product product) {
        productList.set(index, product);
    }

    /* Delete product */
    public void deleteProduct(int index) {
        productList.remove(index);
    }

    /* Returns the total number of products included in the list */
    public int getQuantity() {
        int quantity = 0;
        for (int i = 0; i < productList.size(); i++) {
            quantity++;
        }
        return quantity;
    }
}
