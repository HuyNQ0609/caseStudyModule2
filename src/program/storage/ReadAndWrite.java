package program.storage;

import program.model.Personal;
import program.model.Product;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    private File file;
    private ReadAndWrite() {

    }
    private static ReadAndWrite instance;
    public static ReadAndWrite getInstance(){
        if (instance == null) {
            instance = new ReadAndWrite();
        }
        return instance;
    }
    public ReadAndWrite(File file) {
        this.file = file;
    }
    /* ------------Product------------ */
    public void writeFileProduct(List<Product> products) {
        file = new File("product.dat");
        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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

    /* ------------Staff------------ */
    public void writeFilePersonal(List<Personal> employees) {
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

    public List<Personal> readFilePersonal() {
        file = new File("staff.dat");
        List<Personal> products;
        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            products = (List<Personal>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
