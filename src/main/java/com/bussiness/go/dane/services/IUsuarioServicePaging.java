package com.bussiness.go.dane.services;

import java.util.List;

import com.bussiness.go.dane.entities.commons.Usuario;

public interface IUsuarioServicePaging {

	List<Usuario> findPaginated(Integer pageNo, Integer pageSize);
}
