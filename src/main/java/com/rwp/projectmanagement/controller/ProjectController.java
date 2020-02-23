package com.rwp.projectmanagement.controller;

import com.rwp.projectmanagement.dao.EmployeeRepository;
import com.rwp.projectmanagement.dao.ProjectRepository;
import com.rwp.projectmanagement.entities.Employee;
import com.rwp.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/new")
    public String displayForm(Model model){
        model.addAttribute("project",new Project());
        List<Employee> employees= employeeRepository.findAll();
        model.addAttribute("allEmployees",employees);
        return "projects/new-project";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String processProjectForm(Project project, Model model, @RequestParam List<Long> employees){
        projectRepository.save(project);
        return "redirect:/projects/details";
    }
    @GetMapping("/details")
    public String getProjectsList(Model model){
        List<Project> list = projectRepository.findAll();
        model.addAttribute("project",list);
        return "projects/project-list";
    }
}
