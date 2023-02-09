package com.bussiness.go.dane.services;

import java.util.UUID;

import com.bussiness.go.dane.dto.CiudadDTO;
import com.bussiness.go.dane.entities.commons.Ciudad;

public interface ICiudadService extends CommonService<Ciudad, UUID>{

	public CiudadDTO buscarInformacionCiudad(UUID ciudadId) throws RuntimeException;
}
