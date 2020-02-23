package com.rwp.projectmanagement.controller;

import com.rwp.projectmanagement.dao.EmployeeRepository;
import com.rwp.projectmanagement.dto.EmployeeProject;
import com.rwp.projectmanagement.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/new")
    public String newEmployeeForm(Model model){
        model.addAttribute("employee", new Employee());
        return "employees/new-employee";
    }
    @PostMapping("/save")
    public String processEmployeeForm(Employee employee, Model model){
        employeeRepository.save(employee);
        return "redirect:/employees/details";
    }

    @GetMapping("/details")
    public String getEmployeeList(Model model){
        List<EmployeeProject> employeeProjectsList = employeeRepository.employeeProjects();
        model.addAttribute("employeeProjectCount",employeeProjectsList);
        return "employees/employee-lists";
    }

}
