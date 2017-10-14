package com.toronaga.hand_made_market.services;

import com.toronaga.hand_made_market.dao.ProductStorage;
import com.toronaga.hand_made_market.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductStorage storage;

    public void setProductStorage(ProductStorage storage) {
        this.storage = storage;
    }

    public Product getProductById(int id) {
        return storage.getProductById(id);
    }

    public long getProductCount() {
        return storage.getProductCount();
    }

    public void addProduct(Product p) {
        storage.addProduct(p);
    }

}
