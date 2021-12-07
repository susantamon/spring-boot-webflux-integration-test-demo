package com.example.demo.repository;

import com.example.demo.entity.WebOrder;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends ReactiveCrudRepository<WebOrder, Integer> {
}
