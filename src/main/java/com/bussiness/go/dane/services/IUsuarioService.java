package com.bussiness.go.dane.services;

import java.sql.SQLException;
import java.util.Optional;
import java.util.UUID;

import com.bussiness.go.dane.dto.DataTablesRequest;
import com.bussiness.go.dane.dto.DataTablesResponse;
import com.bussiness.go.dane.dto.UsuarioDTO;
import com.bussiness.go.dane.entities.commons.Usuario;
import com.bussiness.go.dane.utilities.FunctionResponse;

public interface IUsuarioService extends CommonService<Usuario, UUID>{

	Optional<Usuario> findOneByUsuaUsernameOrUsuaEmailAndUsuaEstado(String usuaUsername, String usuaEmail, String usuaEstado);
	
	Optional<Usuario> findOneByUsuaUsernameAndUsuaEstado(String usuaUsername, String usuaEstado);
	
	Optional<Usuario> findOneByUsuaIdAndUsuaEstado(UUID usuaId, String usuaEstado);
	
	FunctionResponse<UsuarioDTO> consultarUsuarioPorId(UUID usuaId);
	
	DataTablesResponse listarTodosLosUsuarios(DataTablesRequest dataTablesRequest);
	
	FunctionResponse<UsuarioDTO> guardarUsuario(UsuarioDTO usuarioDTO) throws RuntimeException, SQLException;
}
