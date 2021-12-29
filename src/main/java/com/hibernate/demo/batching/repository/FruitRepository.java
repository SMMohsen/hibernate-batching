package com.hibernate.demo.batching.repository;

import com.hibernate.demo.batching.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit,Long> {
}
