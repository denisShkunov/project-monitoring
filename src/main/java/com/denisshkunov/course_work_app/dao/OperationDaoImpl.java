package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Operation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OperationDaoImpl implements OperationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Operation> getAllOperation() {
        Session session = sessionFactory.getCurrentSession();
        List<Operation> allOperation = session.createQuery("from Operation ", Operation.class).getResultList();
        return allOperation;
    }

    //Создать запрос и вьющку
    @Override
    public List<Operation> getOperationByStageId(int id) {
        Session session =sessionFactory.getCurrentSession();
        List<Operation> stagesOfProject = session.createQuery("from Operation s where s.stage.id = :id", Operation.class)
                .setParameter("id", id).getResultList();
        return stagesOfProject;
    }
}
