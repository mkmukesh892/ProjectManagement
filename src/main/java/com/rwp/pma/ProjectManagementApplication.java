package com.rwp.pma;

import com.rwp.pma.dao.EmployeeRepository;
import com.rwp.pma.dao.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rwp.pma","com.rwp.utils"})
public class ProjectManagementApplication {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ProjectRepository projectRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }
//    @Bean
//    CommandLineRunner runner(){
//        return args -> {
//            // employee list
//            Employee emp1 = new Employee("Mukesh","Kumar","mukesh@fico.com");
//            Employee emp2 = new Employee("Ananad","Kumar","anand@fico.com");
//            Employee emp3 = new Employee("Dilip","Kumar","dilip@fico.com");
//            Employee emp4 = new Employee("Aditya","Kumar","aditya@fico.com");
//            Employee emp5 = new Employee("Surbhi","Kumari","surbhi@fico.com");
//            Employee emp6 = new Employee("Rakesh","Kumar","rakehs@fico.com");
//            Employee emp7 = new Employee("Mohit","Kumar","mohit@fico.com");
//            Employee emp8 = new Employee("Suraj","Kumar","suraj@fico.com");
//
//            //project list
//            Project project1 = new Project("Critical Project","NOTSTARTED",
//                    "Very critical project, client");
//            Project project2 = new Project("Development Project","INPROGRESS",
//                    "this project is in development, client");
//            Project project3 = new Project("Production Project","COMPLETED",
//                    "project is completed, client");
//            Project project4 = new Project("Testing Project","NOTSTARTED",
//                    "This project is for testing purpose, client");
//        // assign employees to project
//            project1.addEmployee(emp1);
//            project1.addEmployee(emp2);
//            project2.addEmployee(emp1);
//            project3.addEmployee(emp1);
//            project2.addEmployee(emp2);
//            project2.addEmployee(emp3);
//            project3.addEmployee(emp3);
//            project2.addEmployee(emp4);
//
//            //assign projects to employee
//            emp1.setProjects(Arrays.asList(project1,project2,project3));
//            emp2.setProjects(Arrays.asList(project1, project2));
//            emp3.setProjects(Arrays.asList(project2,project3));
//            emp4.setProjects(Arrays.asList(project2));
//            // persist employee in the database
//            employeeRepository.save(emp1);
//            employeeRepository.save(emp2);
//            employeeRepository.save(emp3);
//            employeeRepository.save(emp4);
//            employeeRepository.save(emp5);
//            employeeRepository.save(emp6);
//            employeeRepository.save(emp7);
//            employeeRepository.save(emp8);
//
//            //seed data in the databse of project
//            projectRepository.save(project1);
//            projectRepository.save(project2);
//            projectRepository.save(project3);
//            projectRepository.save(project4);
//        };
//    }
}
