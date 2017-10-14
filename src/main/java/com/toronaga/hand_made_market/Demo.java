package com.toronaga.hand_made_market;

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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("../webapp/WEB-INF/mvc-dispatcher-servlet.xml");
        ProductStorageHibernateImpl storage = ctx.getBean("productStorageHibernateImpl", ProductStorageHibernateImpl.class);

//        listAllRecords(storage);
//
//        Product p = new Product();
//        p.setId(3);
//        p.setName("magnet");
//        p.setDescription("magnet description");
//        p.setPrice(new BigDecimal("75"));
//        p.setIconUrl("/url/magnet.png");
//        storage.addProduct(p);
//
//        listAllRecords(storage);

        System.out.println("now count with hibernate: " + storage.getProductCount());
    }

    private static void listAllRecords(ProductStorageImpl storage) {
        List<Product> products = storage.listProducts();
        System.out.println("All records: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
