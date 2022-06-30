package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.dao.PhaseDAO;
import com.denisshkunov.course_work_app.entity.Phase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhaseServiceImpl implements  PhaseService{

    @Autowired
    private PhaseDAO phaseDAO;

    @Override
    @Transactional
    public List<Phase> getPhaseByProjectId(int projectId) {
        return phaseDAO.getPhaseByProjectId(projectId);
    }
}
