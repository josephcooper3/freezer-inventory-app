package com.example.freezerservice;

import com.example.freezerservice.backend.models.FoodItem;
import com.example.freezerservice.backend.repositories.FoodItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class FreezerserviceApplicationTests {

	@Autowired
	FoodItemRepository foodItemRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFoodItem() {
		FoodItem chips = new FoodItem("Chips", "Carbs", 1, "bag", LocalDate.parse("2020-06-01"), "Home-style seasoned oven chips");
		foodItemRepository.save(chips);
	}

}
