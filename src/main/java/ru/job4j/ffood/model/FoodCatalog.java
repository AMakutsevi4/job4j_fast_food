package ru.job4j.ffood.model;

import lombok.Data;

@Data
public class FoodCatalog {

    int id;
    String name;
    Product product;
    int price;
}
