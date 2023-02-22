package com.diguu.schooldepartment.app.domain.services;

import com.diguu.schooldepartment.app.domain.models.StudentModel;
import com.diguu.schooldepartment.app.infra.data.entities.Student;
import com.diguu.schooldepartment.app.infra.repositories.interfaces.StudentRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DomainStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Async
    public StudentModel findById(UUID id) throws NotFoundException {
        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isEmpty())
            throw new NotFoundException("Student not found");

        return new StudentModel(optional.get());
    }

}
