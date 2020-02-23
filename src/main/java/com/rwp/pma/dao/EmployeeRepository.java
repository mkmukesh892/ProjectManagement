package com.rwp.pma.dao;

import com.rwp.pma.dto.EmployeeProject;
import com.rwp.pma.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Override
    public List<Employee> findAll();

    @Query(nativeQuery = true, value = "select e.employee_id as employeeId, e.email as email, e.first_name as firstName,e.last_name as lastName,count(pe.employee_id) as projectCount from employee as e left join project_employee as pe on e.employee_id=pe.employee_id  group by e.first_name, e.last_name order by e.employee_id asc;")
    public List<EmployeeProject> employeeProjects();
}
