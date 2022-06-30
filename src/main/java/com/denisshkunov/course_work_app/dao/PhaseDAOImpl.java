package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Phase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhaseDAOImpl implements PhaseDAO{

    @Autowired
    SessionFactory sessionFactory;

    //вывод фаз проекта по айди проекта
    @Override
    public List<Phase> getPhaseByProjectId(int projectId) {
        Session session = sessionFactory.getCurrentSession();

        // to do - check how does it work
        List <Phase> phaseOfProject = session.createQuery("from Phase p where p.project.id = :projectId"
                , Phase.class).setParameter("projectId", projectId).getResultList();

;

        return phaseOfProject;
    }
}
