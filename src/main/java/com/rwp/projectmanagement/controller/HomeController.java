package com.rwp.projectmanagement.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rwp.projectmanagement.dao.EmployeeRepository;
import com.rwp.projectmanagement.dao.ProjectRepository;
import com.rwp.projectmanagement.dto.ChartData;
import com.rwp.projectmanagement.dto.EmployeeProject;
import com.rwp.projectmanagement.entities.Employee;
import com.rwp.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    EmployeeRepository employeeRepository;
        @GetMapping("/")
        public String homePage(Model model) throws JsonProcessingException {
        List<Project> list = projectRepository.findAll();
        model.addAttribute("project", list);
        List<ChartData> projectStages = projectRepository.getProjectStages();
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(projectStages);
        model.addAttribute("projectStatus",jsonString);

        List<EmployeeProject> employeeProjectsList = employeeRepository.employeeProjects();
            model.addAttribute("employeeProjectCount",employeeProjectsList);
        return "main/home";
        }
}
