package program.controller;

import program.model.Customer;
import program.model.Product;
import program.storage.ReadAndWrite;

import java.util.*;

public class CustomerManager {
    List<Customer> customers;

    List<Product> products = ReadAndWrite.getInstance().readFileProduct();

    List<Product> invoices = new ArrayList<>();
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

    /* Add new customer */
    public void addNewCustomer(Customer customer) {
        customers.add(customer);
        ReadAndWrite.getInstance().writeFileCustomer(customers);
    }

    /* Edit customer information */
    public void editCustomer(String name) {
        int index;
        for (Customer customer: customers) {
            if (customer.getName().equals(name)) {
                index = customers.indexOf(customer);
                customers.set(index, customer);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileCustomer(customers);
    }

    /* Delete customer information */
    public void deleteCustomer(String name) {
        for (Customer customer: customers) {
            if (customer.getName().equals(name)) {
                customers.remove(customer);
                break;
            }
        }
        ReadAndWrite.getInstance().writeFileCustomer(customers);
    }

    /* Search customer information */
    public String searchCustomer(String name) {
        for (Customer customer: customers) {
            if (name.equals(customer.getName())) {
                return "" + customer;
            }
        }
        return "Customer not found!";
    }

    /* Add products to customers' invoices */
    public void addProductToInvoices(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                invoices.add(product);
                break;
            }
        }
    }

    /* The total amount that customers must pay the bill */

    public int getTotalPriceBill() {
        int total = 0;
        for (Product product : invoices) {
            total += (product.getPrice() * product.getQuantity());
        }
        return total;
    }
}
