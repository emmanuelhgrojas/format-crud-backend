package com.bussiness.go.dane.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bussiness.go.dane.entities.commons.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, UUID>{

	Optional<Pais> findByPaisIdAndPaisEstado(UUID depaId, String paisEstado);
}
