package com.example.skillwillproject19.Repositories;

import com.example.skillwillproject19.Model.RestaurantModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<RestaurantModel,Long>{


}
