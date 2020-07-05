package com.example.freezerservice.backend.services;

import com.example.freezerservice.backend.models.FoodItem;
import com.example.freezerservice.backend.repositories.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class FoodItemService {
    private static final Logger LOGGER = Logger.getLogger(FoodItemService.class.getName());
    private FoodItemRepository foodItemRepository;

    public FoodItemService(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    public List<FoodItem> findAll() {
        return foodItemRepository.findAll();
    }

    public long count() {
        return foodItemRepository.count();
    }

    public void delete(FoodItem foodItem) {
        foodItemRepository.delete(foodItem);
    }

    public void deleteAll() {
        foodItemRepository.deleteAll();
    }

    public void save(FoodItem foodItem) {
        if (foodItem == null) {
            LOGGER.log(Level.SEVERE,
                    "FoodItem is null. Are you sure you have connected your form to the application?");
            return;
        }
        foodItemRepository.save(foodItem);
    }
}
