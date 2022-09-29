package ru.job4j.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.admin.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
