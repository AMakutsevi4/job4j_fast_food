package ru.job4j.ffood.repository;

import ru.job4j.ffood.model.Product;

public interface AdminRepository {

    Product makeDeliveriesOfProducts(Product product);

    int getByProfit(int money);
}
