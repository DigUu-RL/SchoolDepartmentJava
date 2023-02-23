package com.diguu.schooldepartment.app.application.service;

import com.diguu.schooldepartment.app.application.dto.StudentDTO;
import com.diguu.schooldepartment.app.domain.models.StudentModel;
import com.diguu.schooldepartment.app.domain.services.DomainStudentService;
import com.diguu.schooldepartment.app.infra.middleware.exceptions.GlobalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ApplicationStudentService {

    @Autowired
    private DomainStudentService studentService;


    public List<StudentDTO> getAll() {
        return null;
    }


    public StudentDTO findById(UUID id) throws GlobalException {
        StudentModel data = studentService.findById((id));
        return new StudentDTO(data);
    }


    public void save(StudentDTO dto) {

    }


    public void delete(StudentDTO dto) {

    }

}
