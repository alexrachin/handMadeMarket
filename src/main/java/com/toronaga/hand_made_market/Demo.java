package com.toronaga.hand_made_market;

import com.toronaga.hand_made_market.dao.ProductStorage;
import com.toronaga.hand_made_market.dao.ProductStorageHibernateImpl;
import com.toronaga.hand_made_market.dao.ProductStorageImpl;
import com.toronaga.hand_made_market.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

public class Demo {

    @Autowired
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ProductStorageHibernateImpl storage = ctx.getBean("productStorageHibernateImpl", ProductStorageHibernateImpl.class);

        Integer i1 = 12;
        System.out.println(i1);

    }

    private static void listAllRecords(ProductStorage storage) {
        List<Product> products = storage.listProducts();
        System.out.println("All records: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
