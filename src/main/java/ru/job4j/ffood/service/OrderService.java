package ru.job4j.ffood.service;

import org.springframework.stereotype.Service;
import ru.job4j.ffood.model.Client;
import ru.job4j.ffood.model.Courier;

@Service
public class OrderService {

    public boolean completeOrder(Courier courier) {
        return true;
    }

    public boolean receiveOrder(Client client) {
        return true;
    }

}
