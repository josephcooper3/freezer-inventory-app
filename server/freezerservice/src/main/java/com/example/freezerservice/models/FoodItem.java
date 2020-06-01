package com.example.freezerservice.models;

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

    @Column(name = "date_frozen")
    private LocalDate dateFrozen;

    @Column(name = "notes")
    private String notes;

    public FoodItem(String itemName, String foodType, LocalDate dateFrozen, String notes) {
        this.itemName = itemName;
        this.foodType = foodType;
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
