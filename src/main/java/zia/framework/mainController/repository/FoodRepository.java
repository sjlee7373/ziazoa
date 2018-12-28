package zia.framework.mainController.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import zia.framework.mainController.domain.Food;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, String> {
    List<Food> findAllBySpicylevelOrderById(Integer spicylevel);
    List<Food> findAllByNameOrderByPrice(String id);
}
