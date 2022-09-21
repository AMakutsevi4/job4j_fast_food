package ru.job4j.ffood.repository;

import ru.job4j.ffood.model.App;
import ru.job4j.ffood.model.Order;

public interface CourierRepository {

    boolean completeOrder(Order order);

    boolean updateApp(App app);

}
