package com.example.skillwillproject19.Contollers;

import com.example.skillwillproject19.Request.EmployeeRequest;
import com.example.skillwillproject19.Response.EmployeeResponse;
import com.example.skillwillproject19.Model.EmployeeModel;
import com.example.skillwillproject19.Model.RestaurantModel;
import com.example.skillwillproject19.Repositories.EmployeeRepository;
import com.example.skillwillproject19.Repositories.RestaurantRepository;
import com.example.skillwillproject19.Roles.EmployeeRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeRepository repository;

    @Autowired
    RestaurantRepository restaurantRepo;

    @GetMapping("/getAllData/{id}")
    public List<EmployeeResponse> getAllData(@PathVariable Long id)
    {
        List<EmployeeModel> employeList = repository.getAllEmployee(id);
        List<EmployeeResponse> responses = new ArrayList<>();
        for(EmployeeModel emm : employeList)
        {
            EmployeeResponse response = new EmployeeResponse();
            response.setFirstName(emm.getFirstName());
            response.setLastName(emm.getLastName());
            response.setRestaurantName(emm.getRestaurantModel().getRestaurantName());
            response.setSalary(emm.getSalary());
            response.setAge(emm.getAge());
            response.setRoles(emm.getRoles());
            responses.add(response);
        }

        return responses;
    }

    @PostMapping("/insertData")
    public EmployeeRequest saveInDatabase(@RequestBody EmployeeRequest employeeRequest, @RequestParam EmployeeRoles roles)
    {
        EmployeeModel model = new EmployeeModel();
        RestaurantModel remodel = restaurantRepo.getReferenceById(employeeRequest.getRestaurantId());
        model.setFirstName(employeeRequest.getFirstName());
        model.setLastName(employeeRequest.getLastName());
        model.setAge(employeeRequest.getAge());
        model.setRoles(roles);
        model.setSalary(employeeRequest.getSalary());
        model.setRestaurantModel(remodel);
        repository.save(model);
        return employeeRequest;
    }


    @GetMapping("/getFullSalary/{id}")
    public Integer getFullSalary(@PathVariable Long id)
    {
        return repository.getSalaryOfAllEmployee(id);
    }

}
