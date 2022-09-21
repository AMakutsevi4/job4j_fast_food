package ru.job4j.ffood.repository;

import ru.job4j.ffood.model.Client;
import ru.job4j.ffood.model.Courier;

public interface OrderRepository {

    boolean completeOrder(Courier courier);

    boolean receiveOrder(Client client);
}
