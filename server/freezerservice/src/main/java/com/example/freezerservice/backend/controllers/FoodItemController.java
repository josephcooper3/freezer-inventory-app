package com.example.freezerservice.backend.controllers;

import com.example.freezerservice.backend.repositories.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/food_items")
public class FoodItemController {

    @Autowired
    FoodItemRepository foodItemRepository;

}
