package com.diguu.schooldepartment.app.domain.models;

import com.diguu.schooldepartment.app.infra.data.entities.Student;
import com.diguu.schooldepartment.app.infra.data.enums.Gender;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class StudentModel {
    private UUID id;
    private String name;
    private String lastName;
    private String cpf;
    private String identifier;
    private Gender gender;
    private String street;
    private String district;
    private int number;
    private String city;
    private String state;

    private StudentModel(UUID id, String name, String lastName, String cpf, String identifier, Gender gender,
                         String street, String district, int number, String city, String state) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.cpf = cpf;
        this.identifier = identifier;
        this.gender = gender;
        this.street = street;
        this.district = district;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public StudentModel(Student entity) {
        id = entity.getId();
        name = entity.getName();
        lastName = entity.getLastName();
        cpf = getCpf();
        identifier = entity.getIdentifier();
        gender = entity.getGender();
        street = entity.getStreet();
        district = entity.getDistrict();
        number = entity.getNumber();
        city = entity.getCity();
        state = entity.getState();
    }

    public Student ToStudent() {
        return Student.StudentBuilder.getInstance()
                .withId(getId())
                .withName(getName())
                .withLastName(getLastName())
                .withCpf(getCpf())
                .withIdentifier(getIdentifier())
                .withGender(getGender())
                .withStreet(getStreet())
                .withDistrict(getDistrict())
                .withNumber(getNumber())
                .withCity(getCity())
                .withState(getState())
                .build();
    }

}
