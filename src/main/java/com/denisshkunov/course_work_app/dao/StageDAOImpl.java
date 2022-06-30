package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StageDAOImpl implements StageDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Stage> getStageOfPhaseId(int id) {
        Session session = sessionFactory.getCurrentSession();
        List<Stage> stagesOfProject = session.createQuery("from Stage s where s.phase.id = :id", Stage.class)
                .setParameter("id", id).getResultList();
        return stagesOfProject;
    }
}
