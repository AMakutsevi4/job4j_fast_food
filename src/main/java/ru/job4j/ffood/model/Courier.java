package ru.job4j.ffood.model;

import lombok.Data;

import java.util.List;

@Data
public class Courier {

    int id;
    String name;
    String surname;
    PositionCourier positionCourier;
    List<Order> order;
}
