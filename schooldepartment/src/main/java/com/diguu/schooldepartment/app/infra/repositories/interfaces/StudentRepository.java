package com.diguu.schooldepartment.app.infra.repositories.interfaces;

import com.diguu.schooldepartment.app.infra.data.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

}
