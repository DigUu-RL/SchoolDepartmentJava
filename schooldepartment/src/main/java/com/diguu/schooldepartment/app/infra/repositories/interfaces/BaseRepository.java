package com.diguu.schooldepartment.app.infra.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BaseRepository<Entity> extends JpaRepository<Entity, UUID> {
}
