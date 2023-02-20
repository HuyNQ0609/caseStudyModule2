package program.controller.manager;

import program.model.Product;
import program.storage.ReadAndWrite;

import java.util.*;

public class ProductManager {
    List<Product> productList;

    public ProductManager() {
        productList = ReadAndWrite.getInstance().readFileProduct();
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
    public void editProduct(String name, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                productList.set(i, product);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileProduct(productList);
    }

    /* Delete product */
    public void deleteProduct(String name) {
        for (Product product: productList) {
            if (name.equals(product.getName())) {
                productList.remove(product);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileProduct(productList);
    }

    /* Search product */
    public String searchProduct(String name) {
        for (Product product: productList) {
            if (name.equals(product.getName())) {
                return "" + product;
            }
        }
        return "Product not found!";
    }
    /* Show list product */
    public void showListProduct() {
        for (Product product: productList) {
            System.out.println(product);
        }
    }
    /* Arrange products information by price */
    public void sortProducts() {
        Collections.sort(productList);
        for (Product product: productList) {
            System.out.println(product);
        }
    }
}
