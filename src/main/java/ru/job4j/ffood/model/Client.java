package ru.job4j.ffood.model;

import lombok.Data;

import java.util.List;

@Data
public class Client {

    int id;
    String name;
    String surname;
    String address;
    int phone;
    List<Order> order;
}
