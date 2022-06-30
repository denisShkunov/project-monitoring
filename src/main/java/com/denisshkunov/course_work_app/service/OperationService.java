package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.entity.Operation;

import java.util.List;

public interface OperationService {

    public List<Operation> getOperationByStageId(int id);
}
