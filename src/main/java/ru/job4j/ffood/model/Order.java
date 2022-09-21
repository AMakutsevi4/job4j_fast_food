package ru.job4j.ffood.model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    int id;
    String name;
    List<FoodCatalog> foodCatalog;
    Client client;
    Courier courier;
}
