package com.rwp.pma.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rwp.pma.dao.EmployeeRepository;
import com.rwp.pma.dao.ProjectRepository;
import com.rwp.pma.dto.ChartData;
import com.rwp.pma.dto.EmployeeProject;
import com.rwp.pma.entities.Project;
import com.rwp.pma.springExample.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Value("${version}")
    private String version;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    EmployeeRepository employeeRepository;
        @GetMapping("/")
        public String homePage(Model model) throws JsonProcessingException {
            model.addAttribute("versionNumber",this.version);
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
