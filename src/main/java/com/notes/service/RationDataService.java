package com.notes.service;

import com.notes.domain.RationData;
import com.notes.repository.RationDataRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RationDataService {

    @Autowired
    private RationDataRespository rationDataRespository;

    public RationData save(RationData rationData) {
       return rationDataRespository.save(rationData);
    }
}
