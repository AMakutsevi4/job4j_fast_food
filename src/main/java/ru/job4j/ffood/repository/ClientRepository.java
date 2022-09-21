package ru.job4j.ffood.repository;

import ru.job4j.ffood.model.App;
import ru.job4j.ffood.model.PositionCourier;
import ru.job4j.ffood.model.Order;

public interface ClientRepository {

    PositionCourier getPositionCourier(PositionCourier positionCourier);

    boolean downloadApp(App app);

    boolean payOrder(Order order);
}
