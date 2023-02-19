package program.controller;

import program.model.CustomerInvoices;
import program.model.Wage;

import java.util.*;

public class CustomerManager implements Wage {
    List<CustomerInvoices> listProductInInvoices = new ArrayList<>();

    public CustomerManager() {}

    public CustomerManager(List<CustomerInvoices> listProductInInvoices) {
        this.listProductInInvoices = listProductInInvoices;
    }

    public List<CustomerInvoices> getListProductInInvoices() {
        return listProductInInvoices;
    }

    public void setListProductInInvoices(List<CustomerInvoices> listProductInInvoices) {
        this.listProductInInvoices = listProductInInvoices;
    }

    /* Add products to customers' invoices */
    public void addProductToInvoices (CustomerInvoices product) {
        listProductInInvoices.add(product);
    }

    /* The total amount that customers must pay the bill */
    @Override
    public int getMoney() {
        int totalMoney = 0;
        for (CustomerInvoices product : listProductInInvoices) {
            totalMoney += (product.getPrice() * product.getQuantity());
        }
        return totalMoney;
    }
    /* Display a list of products selected by customers */

    public List<CustomerInvoices> showInvoices() {
        return listProductInInvoices;
    }
}
