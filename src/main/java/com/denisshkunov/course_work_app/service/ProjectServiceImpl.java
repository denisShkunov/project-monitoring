package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.dao.ProjectDAO;
import com.denisshkunov.course_work_app.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDAO projectDAO;

    @Override
    @Transactional
    public List<Project> getAllProjects() {
        return projectDAO.getAllProject();
    }
}
