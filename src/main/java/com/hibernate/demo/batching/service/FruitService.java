package com.hibernate.demo.batching.service;

import com.hibernate.demo.batching.model.Fruit;
import com.hibernate.demo.batching.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;


    public List<Fruit> create(List<Fruit> fruits) {


        return fruitRepository.saveAll(fruits);
    }
}
