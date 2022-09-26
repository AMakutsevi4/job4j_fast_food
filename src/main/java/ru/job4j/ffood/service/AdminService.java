package ru.job4j.ffood.service;

import org.springframework.stereotype.Service;
import ru.job4j.ffood.model.Product;

@Service
public class AdminService {

    public Product makeDeliveriesOfProducts(Product product) {
        return new Product();
    }

    public int getByProfit(int money) {
        return 0;
    }
}
