package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.dao.BrigadeDAO;
import com.denisshkunov.course_work_app.entity.Brigade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BrigadeServiceImpl implements BrigadeService{

    @Autowired
    private BrigadeDAO brigadeDAO;


    @Override
    @Transactional
    public List<Brigade> getAllBrigade() {
        return brigadeDAO.getAllBrigade();
    }
}
