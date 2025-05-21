package com.premraj.model;

import jakarta.persistence.*;

/**
 * @author premraj.murugaraj
 */

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String band;
    private Double price;
    private String category;
    @Column(name = "release_date")
    private String releaseDate;
    @Column(name= "product_available")
    private Boolean isAvailable;
    @Column(name = "stock_quantity")
    private Integer quantity;

    public Product() {
    }

    public Product(Integer id, String name, String description, String band, Double price, String category, String releaseDate, Boolean isAvailable, Integer quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.band = band;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
