package com.diguu.schooldepartment.app.domain.services;

import com.diguu.schooldepartment.app.domain.models.StudentModel;
import com.diguu.schooldepartment.app.infra.data.entities.Student;
import com.diguu.schooldepartment.app.infra.middleware.exceptions.GlobalException;
import com.diguu.schooldepartment.app.infra.repositories.interfaces.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DomainStudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentModel> getAll() {
        return null;
    }

    @Async
    public StudentModel findById(UUID id) throws GlobalException {
        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isEmpty())
            throw new GlobalException("Student not found", HttpStatus.NOT_FOUND);

        return new StudentModel(optional.get());
    }

    public void save(StudentModel model) {

    }

    public void delete(StudentModel model) {

    }

}
