package com.example.skillwillproject19.Request;

import com.example.skillwillproject19.Model.RestaurantModel;
import com.example.skillwillproject19.Roles.EmployeeRoles;
import jakarta.persistence.*;

public class EmployeeRequest {



    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private Long restaurantId;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
