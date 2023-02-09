package com.bussiness.go.dane.services.implementation;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bussiness.go.dane.dto.CiudadDTO;
import com.bussiness.go.dane.entities.commons.Ciudad;
import com.bussiness.go.dane.entities.commons.Departamento;
import com.bussiness.go.dane.entities.commons.Pais;
import com.bussiness.go.dane.repositories.ICiudadRepository;
import com.bussiness.go.dane.repositories.IDepartamentoRepository;
import com.bussiness.go.dane.repositories.IPaisRepository;
import com.bussiness.go.dane.services.ICiudadService;
import com.bussiness.go.dane.utilities.ConstantesApp;
import com.bussiness.go.dane.utilities.MensajesApp;

@Service
public class CiudadServiceImpl extends CommonServiceImpl<Ciudad, ICiudadRepository, UUID> implements ICiudadService{
	
	@Autowired
	private ICiudadRepository iCiudadRepository;
	
	@Autowired
	private IDepartamentoRepository iDepartamentoRepository;
	
	@Autowired
	private IPaisRepository iPaisRepository;

	@Override
	public CiudadDTO buscarInformacionCiudad(UUID ciudadId) throws RuntimeException{
		Optional<Ciudad> ciudadOptional =iCiudadRepository.findByCiudIdAndCiudEstado(ciudadId, ConstantesApp.ESTADO_REGISTRO_ACTIVO);
		if(!ciudadOptional.isPresent()) {
			throw new RuntimeException(MensajesApp.CIUDAD_404);
		}
		Ciudad Ciudad = ciudadOptional.get();
		CiudadDTO ciudadDTO = Ciudad.toBO();
		
		Optional<Departamento> departamentoOptional = iDepartamentoRepository.findByDepaIdAndDepaEstado(Ciudad.getDepaId(), ConstantesApp.ESTADO_REGISTRO_ACTIVO);
		if(!departamentoOptional.isPresent()) {
			throw new RuntimeException(MensajesApp.DEPARTAMENTO_404);
		}
		Departamento departamento = departamentoOptional.get();
		ciudadDTO.setDepaId(departamento.getDepaId());
		
		Optional<Pais> paisOptional =  iPaisRepository.findByPaisIdAndPaisEstado(departamento.getPaisId(), ConstantesApp.ESTADO_REGISTRO_ACTIVO);
		if(!paisOptional.isPresent()) {
			throw new RuntimeException(MensajesApp.PAIS_404);
		}
		Pais paisDTO = paisOptional.get();
		ciudadDTO.setPaisId(paisDTO.getPaisId());		
		return ciudadDTO;
	}

}
