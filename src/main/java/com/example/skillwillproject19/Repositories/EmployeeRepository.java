package com.example.skillwillproject19.Repositories;

import com.example.skillwillproject19.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
    @Query("SELECT em FROM EmployeeModel em WHERE em.restaurantModel.id = :restaurantId")
    List<EmployeeModel> getAllEmployee(@Param("restaurantId") Long restaurantId);


    @Query("SELECT sum(em.salary) from EmployeeModel em WHERE em.restaurantModel.id = :restaurantId")
    int getSalaryOfAllEmployee(@Param("restaurantId") Long restaurantId);


}
