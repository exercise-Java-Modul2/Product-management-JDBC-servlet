package service;

import models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceiplm implements ProductService {

    static final String url = "jdbc:mysql://localhost:3306/productmanager";
    static final String user = "root";
    static final String password = "phantiensy";

    public ProductServiceiplm() {
    }

    @Override
    public List<Product> findAll() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = null;
        statement = connection.createStatement();

        String sql;
        sql = "select * from products";

        ResultSet resultSet = statement.executeQuery(sql);

        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name_product"));
            product.setPrice(resultSet.getDouble("price"));
            product.setCategory_id(resultSet.getInt("category_id"));

            products.add(product);
        }
        connection.close();
        statement.close();
        resultSet.close();
        return products;
    }

    @Override
    public void save(Product product) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement statement = null;

        String sql;
        sql = "insert into products(name_product, price, category_id) VALUES (?, ?, ?)";

        statement = connection.prepareStatement(sql);

        statement.setString(1, product.getName());
        statement.setDouble(2, product.getPrice());
        statement.setInt(3, product.getCategory_id());

        statement.executeUpdate();

        statement.close();
        connection.close();
    }

    @Override
    public void remove(int id, Product product) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);


        String sql = "delete from products where id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        statement.executeUpdate();
        statement.close();
        connection.close();
    }

    @Override
    public void update(int id, Product product) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "update products set name_product = ?, price = ?, category_id = ? where id=?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, product.getName());
        statement.setDouble(2, product.getPrice());
        statement.setInt(3, product.getCategory_id());
        statement.setInt(4, product.getId());

        statement.executeUpdate();
        statement.close();
        connection.close();
    }

    @Override
    public Product findById(int id) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from products where id=?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Product product = new Product();

        while (resultSet.next()) {
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name_product"));
            product.setPrice(resultSet.getDouble("price"));
            product.setCategory_id(resultSet.getInt("category_id"));
        }
        resultSet.close();
        statement.close();
        connection.close();
        return product;
    }
}
