package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Operation;

import java.util.List;


public interface OperationDAO {

    public List<Operation> getAllOperation();

    public List<Operation>getOperationByStageId(int id);

}
