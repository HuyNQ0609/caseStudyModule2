package program.controller;

import program.model.Product;
import program.storage.ReadAndWrite;

import java.util.*;

public class ProductManager {
    List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public ProductManager(List<Product> productList) {
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
        ReadAndWrite.getInstance().writeFileProduct(productList);
    }

    /* Edit product */
    public void editProduct(String name) {
        int index;
        for (Product product: productList) {
            if (product.getName().equals(name)) {
                index = productList.indexOf(product);
                productList.set(index, product);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileProduct(productList);
    }

    /* Delete product */
    public void deleteProduct(String name) {
        for (Product product: productList) {
            if (product.getName().equals(name)) {
                productList.remove(product);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileProduct(productList);
    }

    /* Search product */
    public String searchStaff(String name) {
        for (Product product: productList) {
            if (name.equals(product.getName())) {
                return "" + product;
            }
        }
        return "Product not found!";
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
