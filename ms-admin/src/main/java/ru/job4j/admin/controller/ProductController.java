package ru.job4j.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.admin.model.Product;
import ru.job4j.admin.service.ProductService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        try {
            return productService.save(product);
        } catch (Exception e) {
            throw new IllegalArgumentException("Проверьте правильность оформления продукта");
        }
    }

    @GetMapping("/addProduct")
    public String addProduct(Model model) {
        model.addAttribute("items", productService.findAll());
        return "addProduct";
    }


    @DeleteMapping("/")
    public void delete(@RequestParam() long id) {
        try {
            Product product = new Product();
            product.setId(id);
            productService.delete(id);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @GetMapping("/deleteProduct/{productId}")
    public String deleteItem(@PathVariable("productId") int id) {
        productService.delete(id);
        return "redirect:/product";
    }
}
