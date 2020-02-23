package com.rwp.projectmanagement.dao;

import com.rwp.projectmanagement.dto.ChartData;
import com.rwp.projectmanagement.entities.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    @Override
    public List<Project> findAll();
    @Query(nativeQuery = true, value = " select project_stage as label, count(*) as value from project group by project_stage")
    public List<ChartData> getProjectStages();

}
