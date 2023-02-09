package com.bussiness.go.dane.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bussiness.go.dane.entities.commons.Usuario;

@Repository
public interface IUsuarioRepositoryPaging extends PagingAndSortingRepository<Usuario, UUID>{

}
