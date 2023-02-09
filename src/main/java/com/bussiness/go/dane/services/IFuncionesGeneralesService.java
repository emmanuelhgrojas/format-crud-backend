package com.bussiness.go.dane.services;

import java.io.IOException;

public interface IFuncionesGeneralesService {

	public Boolean eliminarArchivo(String pathArchivo) throws IOException;
	
	public String encodeFileToBase64Binary(String nombreArchivo);
}
