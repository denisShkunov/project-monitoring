package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectDAOImpl implements ProjectDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Project> getAllProject() {
        Session session = sessionFactory.getCurrentSession();
        List<Project> allProjects = session.createQuery("from Project", Project.class)
                .getResultList();
        return allProjects;

    }
}
