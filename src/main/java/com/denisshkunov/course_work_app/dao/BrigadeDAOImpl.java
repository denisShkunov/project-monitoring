package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Brigade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BrigadeDAOImpl implements BrigadeDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Brigade> getAllBrigade() {
        Session session = sessionFactory.getCurrentSession();
        List<Brigade>allBrigade = session.createQuery("from Brigade", Brigade.class )
                .getResultList();
        return allBrigade;
    }
}
