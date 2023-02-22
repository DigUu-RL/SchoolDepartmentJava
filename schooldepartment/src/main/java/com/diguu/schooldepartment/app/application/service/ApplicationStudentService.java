package com.diguu.schooldepartment.app.application.service;

import com.diguu.schooldepartment.app.application.dto.StudentDTO;
import com.diguu.schooldepartment.app.domain.models.StudentModel;
import com.diguu.schooldepartment.app.domain.services.DomainStudentService;
import com.diguu.schooldepartment.app.infra.middleware.exceptions.GlobalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplicationStudentService {

    @Autowired
    private DomainStudentService domainStudentService;

    @Async
    public StudentDTO findById(UUID id) throws GlobalException {
        StudentModel data = domainStudentService.findById(id);
        return new StudentDTO(data);
    }
}
