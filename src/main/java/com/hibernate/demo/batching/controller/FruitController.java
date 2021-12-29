package com.hibernate.demo.batching.controller;

import com.hibernate.demo.batching.model.Fruit;
import com.hibernate.demo.batching.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping
    public List<Fruit> create(@RequestBody List<Fruit> fruits) {

        return fruitService.create(fruits);
    }
}
