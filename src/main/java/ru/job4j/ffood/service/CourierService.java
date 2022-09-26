package ru.job4j.ffood.service;

import org.springframework.stereotype.Service;
import ru.job4j.ffood.model.App;
import ru.job4j.ffood.model.Order;

@Service
public class CourierService {

    public boolean completeOrder(Order order) {
        return true;
    }

    public boolean updateApp(App app) {
        return true;
    }
}
