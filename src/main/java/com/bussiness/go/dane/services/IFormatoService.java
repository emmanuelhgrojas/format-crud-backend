package com.bussiness.go.dane.services;

import java.sql.SQLException;
import java.util.UUID;

import com.bussiness.go.dane.dto.DataTablesRequest;
import com.bussiness.go.dane.dto.DataTablesResponse;
import com.bussiness.go.dane.dto.FormatoDTO;
import com.bussiness.go.dane.entities.commons.Formato;
import com.bussiness.go.dane.utilities.FunctionResponse;

public interface IFormatoService extends CommonService<Formato, UUID>{

	FunctionResponse<FormatoDTO> guardarFormato(FormatoDTO formatoDTO) throws RuntimeException, SQLException;
	
	public FunctionResponse<FormatoDTO> consultarFormatoPorId(UUID viajId);
	
	public FunctionResponse<FormatoDTO> eliminarFormatoPorId(UUID viajId);
	
	DataTablesResponse listarTodosLosFormatos(DataTablesRequest dataTablesRequest);
}
