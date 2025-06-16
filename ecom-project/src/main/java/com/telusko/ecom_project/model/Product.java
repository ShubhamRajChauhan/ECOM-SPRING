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

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String brand;

    @Column(length = 1000)
    private String description;

    private BigDecimal price;
    private String category;

    private int stockQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date releaseDate;

    private boolean productAvailable;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;

    public Product() {
    }

    public Product(int id, String name, String brand, String description, BigDecimal price, String category,
                   int stockQuantity, Date releaseDate, boolean productAvailable,
                   String imageName, String imageType, byte[] imageData) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.releaseDate = releaseDate;
        this.productAvailable = productAvailable;
        this.imageName = imageName;
        this.imageType = imageType;
        this.imageData = imageData;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public String getDescription() { return description; }
    public BigDecimal getPrice() { return price; }
    public String getCategory() { return category; }
    public int getStockQuantity() { return stockQuantity; }
    public Date getReleaseDate() { return releaseDate; }
    public boolean isProductAvailable() { return productAvailable; }
    public String getImageName() { return imageName; }
    public String getImageType() { return imageType; }
    public byte[] getImageData() { return imageData; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public void setCategory(String category) { this.category = category; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }
    public void setProductAvailable(boolean productAvailable) { this.productAvailable = productAvailable; }
    public void setImageName(String imageName) { this.imageName = imageName; }
    public void setImageType(String imageType) { this.imageType = imageType; }
    public void setImageData(byte[] imageData) { this.imageData = imageData; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", releaseDate=" + releaseDate +
                ", productAvailable=" + productAvailable +
                ", imageName='" + imageName + '\'' +
                ", imageType='" + imageType + '\'' +
                '}';
    }
}



