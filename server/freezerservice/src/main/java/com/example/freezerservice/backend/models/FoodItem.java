package com.example.freezerservice.backend.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="food_items")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "food_type")
    private String foodType;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit")
    private String unit;

    @Column(name = "date_frozen")
    private LocalDate dateFrozen;

    @Column(name = "notes")
    private String notes;

    public FoodItem(String itemName, String foodType, Integer quantity, String unit, LocalDate dateFrozen, String notes) {
        this.itemName = itemName;
        this.foodType = foodType;
        this.quantity = quantity;
        this.unit = unit;
        this.dateFrozen = dateFrozen;
        this.notes = notes;
    }

    public FoodItem() {
    }

    public String getItemName() {
        return itemName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDate getDateFrozen() {
        return dateFrozen;
    }

    public void setDateFrozen(LocalDate dateFrozen) {
        this.dateFrozen = dateFrozen;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
