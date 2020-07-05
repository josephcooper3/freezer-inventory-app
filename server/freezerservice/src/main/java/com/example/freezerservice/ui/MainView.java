package com.example.freezerservice.ui;

import com.example.freezerservice.backend.models.FoodItem;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    private Grid<FoodItem> grid = new Grid<>(FoodItem.class);

    public MainView() {
        addClassName("list-view");
        setSizeFull();
        configureGrid();

        add(grid);
    }

    private void configureGrid() {
        grid.addClassName("fooditem-grid");
        grid.setSizeFull();
        grid.setColumns("itemName", "foodType", "quantity", "unit", "dateFrozen", "notes");
    }

}
