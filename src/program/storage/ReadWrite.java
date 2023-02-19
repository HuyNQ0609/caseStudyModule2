package program.storage;

import program.model.Personal;
import program.model.Product;

import java.util.List;

public interface ReadWrite {
    void writeFileStaff(List<Personal> employees);

    List<Personal> readFileStaff();

    void writeFileProduct(List<Product> products);

    List<Product> readFileProduct();
}
