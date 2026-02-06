package com.abhishek.restapilearning.restapilearning.controllers;

import com.abhishek.restapilearning.restapilearning.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/{employeeid}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeid") Long id){
        return new EmployeeDTO(id, "abhi", "abhi@gmail.com", 25, LocalDate.of(2020, 12, 1), true);
    }

    @PostMapping(path = "/create")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(1L);
        return inputEmployee;
    }

    @PutMapping(path = "/update")
    public String updateEmployeeDetailById(){
        return "User Detail Updated";
    }

    @DeleteMapping(path = "/delete")
    public String deleteUserById(){
        return "user deleted";
    }
}
