package com.example.freezerservice;

import com.example.freezerservice.backend.models.FoodItem;
import com.example.freezerservice.backend.services.FoodItemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class FreezerserviceApplicationTests {

	@Autowired
	FoodItemService foodItemService;

	@BeforeEach
	public void init() {
		foodItemService.deleteAll();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFoodItem() {
		FoodItem chips = new FoodItem("Chips", "Carbs", 1, "bag", LocalDate.parse("2020-06-01"), "Home-style seasoned oven chips");
		foodItemService.save(chips);
		assertEquals(1, foodItemService.count());
	}

	@Test
	public void deleteFoodItem() {
		FoodItem chips = new FoodItem("Chips", "Carbs", 1, "bag", LocalDate.parse("2020-06-01"), "Home-style seasoned oven chips");
		foodItemService.save(chips);
		foodItemService.delete(chips);
		assertEquals(0, foodItemService.count());
	}

}
