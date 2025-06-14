//package com.telusko.ecom_project.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Generated;
//import lombok.NoArgsConstructor;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String name;
//    private String desc;
//    private String brand;
//    private BigDecimal price;
//    private String category;
//    private Date releaseDate;
//    private boolean available;
//    private int quantity;
//
//}


package com.telusko.ecom_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean available;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, String desc, String brand, BigDecimal price, String category, Date releaseDate, boolean available, int quantity) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.available = available;
        this.quantity = quantity;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDesc() { return desc; }
    public String getBrand() { return brand; }
    public BigDecimal getPrice() { return price; }
    public String getCategory() { return category; }
    public Date getReleaseDate() { return releaseDate; }
    public boolean isAvailable() { return available; }
    public int getQuantity() { return quantity; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDesc(String desc) { this.desc = desc; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public void setCategory(String category) { this.category = category; }
    public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }
    public void setAvailable(boolean available) { this.available = available; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // toString
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseDate +
                ", available=" + available +
                ", quantity=" + quantity +
                '}';
    }
}
