package com.diguu.schooldepartment.app.application.dto;

import com.diguu.schooldepartment.app.domain.models.StudentModel;
import com.diguu.schooldepartment.app.infra.data.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class StudentDTO {
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
    
    public StudentDTO(StudentModel model) {
        id = model.getId();
        name = model.getName();
        lastName = model.getLastName();
        cpf = getCpf();
        identifier = model.getIdentifier();
        gender = model.getGender();
        street = model.getStreet();
        district = model.getDistrict();
        number = model.getNumber();
        city = model.getCity();
        state = model.getState();
    }

}
