package com.notes.controller;

import com.notes.service.RationDataService;
import com.notes.domain.RationData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/")
@CrossOrigin("*")
public class UserInputDataController {

    private RationDataService rationDataService;
    @PostMapping("/insertData")
    public RationData insertRation(@RequestBody RationData rationData){
       return rationDataService.save(rationData);
    }
}

//
//    @Value("${custom.value}")
//
//    private String customVal;