package com.toronaga.hand_made_market.dao;

import com.toronaga.hand_made_market.model.Product;

import java.util.List;

public interface ProductStorage {
    void addProduct(Product p);

    void updateProduct(Product p);

    void removeProduct(int id);

    Product getProductById(int id);

    long getProductCount();

    List<Product> listProducts();
}
