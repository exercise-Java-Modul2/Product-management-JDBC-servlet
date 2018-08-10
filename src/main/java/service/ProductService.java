package service;

import models.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    List<Product> findAll() throws ClassNotFoundException, SQLException;

    void save(Product product) throws ClassNotFoundException, SQLException;
    void remove(int id, Product product)  throws ClassNotFoundException, SQLException;
    void update(int id, Product product)  throws ClassNotFoundException, SQLException;
    Product findById(int id) throws SQLException, ClassNotFoundException;
}
