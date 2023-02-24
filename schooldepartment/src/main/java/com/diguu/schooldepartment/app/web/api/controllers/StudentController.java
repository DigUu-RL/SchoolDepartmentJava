package com.diguu.schooldepartment.app.web.api.controllers;

import com.diguu.schooldepartment.app.application.dto.StudentDTO;
import com.diguu.schooldepartment.app.application.service.ApplicationStudentService;
import com.diguu.schooldepartment.app.infra.middleware.exceptions.GlobalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private ApplicationStudentService studentService;

    @GetMapping("/{id}")
    public StudentDTO findById(@PathVariable UUID id) throws GlobalException {
        return studentService.findById(id);
    }

}
