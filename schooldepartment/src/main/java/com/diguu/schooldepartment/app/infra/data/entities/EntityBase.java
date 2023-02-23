package com.diguu.schooldepartment.app.infra.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
public abstract class EntityBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private Date createDate;
    private Date lastUpdate;
    private boolean excluded;
}
