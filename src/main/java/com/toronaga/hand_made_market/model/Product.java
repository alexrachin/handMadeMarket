package com.toronaga.hand_made_market.model;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "product")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "icon_url")
    private String iconUrl;
    @ElementCollection
    @JoinTable(name = "product_data", joinColumns = @JoinColumn(name = "product_id"))
    @GenericGenerator(name = "hilo-gen", strategy = "hilo")
    @CollectionId(columns = {@Column(name = "id")}, generator = "hilo-gen", type = @Type(type = "long"))
    private Collection<ProductData> data = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Collection<ProductData> getData() {
        return data;
    }

    public void setData(Collection<ProductData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iconUrl='" + iconUrl + '\'' +
                ", data=" + data +
                '}';
    }
}
