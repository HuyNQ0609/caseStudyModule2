package program.storage;

import program.model.Customer;
import program.model.Personal;
import program.model.Product;

import java.util.List;

public interface ReadWrite {
    void writeFileStaff(List<Personal> employees);

    List<Personal> readFileStaff();

    void writeFileCustomer(List<Customer> customers);

    List<Customer> readFileCustomer();

    void writeFileProduct(List<Product> products);

    List<Product> readFileProduct();
}
