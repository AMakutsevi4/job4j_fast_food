package ru.job4j.ffood.service;

import org.springframework.stereotype.Service;
import ru.job4j.ffood.model.App;
import ru.job4j.ffood.model.Order;
import ru.job4j.ffood.model.PositionCourier;

@Service
public class ClientService {

    public PositionCourier getPositionCourier(PositionCourier positionCourier) {
        return new PositionCourier();
    }

    public boolean downloadApp(App app) {
        return true;
    }

    public boolean payOrder(Order order) {
        return true;
    }
}
