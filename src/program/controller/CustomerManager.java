package program.controller;

import program.model.CustomerInvoices;
import program.model.Product;
import program.storage.ReadAndWrite;

import java.util.*;

public class CustomerManager {
    List<Product> products;

    public CustomerManager() {}

    public CustomerManager(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    List<CustomerInvoices> invoices = new ArrayList<>();

    /* Add products to customers' invoices */
    public void addProductToInvoices(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                invoices.add((CustomerInvoices) product);
                break;
            }
        }
    }

    public void editProductToInvoices() {

    }

    /* The total amount that customers must pay the bill */

    public int getTotalPriceBill() {
        int total = 0;
        for (CustomerInvoices product : invoices) {
            total += (product.getPrice() * product.getQuantity());
        }
        return total;
    }
    /* Display a list of products selected by customers */

    public List<CustomerInvoices> showInvoices() {
        return invoices;
    }
}
