package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.dao.OperationDAO;
import com.denisshkunov.course_work_app.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OperationServiceImpl implements OperationService{

    @Autowired
    OperationDAO operationDAO;

    @Override
    @Transactional
    public List<Operation> getOperationByStageId(int id) {
        return operationDAO.getOperationByStageId(id);
    }
}
