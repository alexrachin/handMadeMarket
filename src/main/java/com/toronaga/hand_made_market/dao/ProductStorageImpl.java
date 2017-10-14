package com.toronaga.hand_made_market.dao;


import com.toronaga.hand_made_market.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class ProductStorageImpl implements ProductStorage {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void addProduct(Product p) {
        String sql = "INSERT INTO product (product_id, name, description, price, icon_url) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{p.getId(), p.getName(), p.getDescription(), p.getPrice(), p.getIconUrl()});
    }

    public void updateProduct(Product book) {

    }
    public void removeProduct(int id) {

    }

    public Product getProductById(int id) {
        String sql = "SELECT * FROM handmade.product WHERE product_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ProductMapper());
    }

    @Override
    public long getProductCount() {
        return 0;
    }

    public int getProductsCount() {
        String sql = "SELECT COUNT(*) FROM handmade.product";
        return jdbcTemplate.queryForInt(sql);

    }

    public List<Product> listProducts() {
        String sql = "SELECT * FROM handmade.product";
        return jdbcTemplate.query(sql, new ProductMapper());
    }

    private static final class ProductMapper implements RowMapper<Product> {

        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product p = new Product();
            p.setId(rowNum);
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setPrice(rs.getBigDecimal("price"));
            p.setIconUrl(rs.getString("icon_url"));
            return p;
        }
    }
}
