package com.toronaga.hand_made_market.dao;

import com.toronaga.hand_made_market.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductStorageHibernateImpl implements ProductStorage {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public long getProductCount() {
        String hql = "SELECT COUNT (*) FROM Product";
        Query query = getSessionFactory().openSession().createQuery(hql);
        return (long) query.uniqueResult();
    }

    @Override
    public void addProduct(Product p) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateProduct(Product book) {

    }
    @Override
    public void removeProduct(int id) {

    }
    @Override
    public Product getProductById(int id) {
        return (Product) getSessionFactory().openSession().get(Product.class, id);
    }
    @Override
    public List<Product> listProducts() {
        return null;
    }
}
