package com.diguu.schooldepartment.app.infra.data.entities;

import com.diguu.schooldepartment.app.infra.data.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Student")
public class Student extends EntityBase implements Serializable {
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

    // relationships ...

    // builder pattern
    public static final class StudentBuilder {
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

        private StudentBuilder() {
        }

        public static StudentBuilder getInstance() {
            return new StudentBuilder();
        }

        public StudentBuilder withId(UUID id) {
            this.id = id;
            return this;
        }

        public StudentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder withCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public StudentBuilder withIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public StudentBuilder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder withStreet(String street) {
            this.street = street;
            return this;
        }

        public StudentBuilder withDistrict(String district) {
            this.district = district;
            return this;
        }

        public StudentBuilder withNumber(int number) {
            this.number = number;
            return this;
        }

        public StudentBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public StudentBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setLastName(lastName);
            student.setCpf(cpf);
            student.setIdentifier(identifier);
            student.setGender(gender);
            student.setStreet(street);
            student.setDistrict(district);
            student.setNumber(number);
            student.setCity(city);
            student.setState(state);
            return student;
        }
    }

}
