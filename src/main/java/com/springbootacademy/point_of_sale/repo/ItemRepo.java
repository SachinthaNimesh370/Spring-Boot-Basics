package com.springbootacademy.point_of_sale.repo;

import com.springbootacademy.point_of_sale.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Integer> {
}
