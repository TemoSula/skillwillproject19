package com.example.skillwillproject19.Response;

import com.example.skillwillproject19.Roles.EmployeeRoles;

public class EmployeeResponse {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private EmployeeRoles roles;
    private String RestaurantName;


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

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public EmployeeRoles getRoles() {
        return roles;
    }

    public void setRoles(EmployeeRoles roles) {
        this.roles = roles;
    }
}
