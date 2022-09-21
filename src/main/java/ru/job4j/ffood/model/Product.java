package ru.job4j.ffood.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Product {

    int id;
    String name;
    LocalDate expiration;
    int price;
}
