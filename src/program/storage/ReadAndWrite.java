package program.storage;

import program.model.*;

import java.io.*;
import java.util.*;

public class ReadAndWrite implements ReadWrite {
    private File file;
    private ReadAndWrite() {}
    private static ReadAndWrite instance;
    public static ReadAndWrite getInstance() {
        if (instance == null) {
            instance = new ReadAndWrite();
        }
        return instance;
    }
    public ReadAndWrite(File file) {
        this.file = file;
    }
    /* ------------Customer------------ */
    @Override
    public void writeFileCustomer(List<Customer> customers) {
        file = new File("customer.dat");
        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeObject(customers);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> readFileCustomer() {
        file = new File("customer.dat");
        List<Customer> customers;
        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            customers = (List<Customer>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

    /* ------------Staff------------ */
    @Override
    public void writeFileStaff(List<Personal> employees) {
        file = new File("staff.dat");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeObject(employees);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Personal> readFileStaff() {
        file = new File("staff.dat");
        List<Personal> employees;
        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            employees = (List<Personal>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    /* ------------Product------------ */
    @Override
    public void writeFileProduct(List<Product> products) {
        file = new File("product.dat");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> readFileProduct() {
        file = new File("product.dat");
        List<Product> products;
        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
