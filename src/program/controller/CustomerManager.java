package program.controller;

import program.model.Customer;

import java.util.*;

public class CustomerManager {
    public List<Customer> customers;

    public CustomerManager() {
        customers = new ArrayList<>();
    }

    public CustomerManager(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
