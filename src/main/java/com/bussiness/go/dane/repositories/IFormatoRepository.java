package com.bussiness.go.dane.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bussiness.go.dane.entities.commons.Formato;

@Repository
public interface IFormatoRepository extends JpaRepository<Formato, UUID>{

}
