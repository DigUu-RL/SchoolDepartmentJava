package com.diguu.schooldepartment.app.infra.repositories.interfaces;

import com.diguu.schooldepartment.app.infra.data.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {

}
