package com.bussiness.go.dane.services;

import java.util.List;
import java.util.UUID;

import com.bussiness.go.dane.entities.commons.BandejaFormatoModel;

public interface IBandejaFormatoService extends CommonService<BandejaFormatoModel, UUID>{

	public List<BandejaFormatoModel> listaFormatosPorEstadoConFiltro(String filtro, String estado, Integer limitQuery, Integer offsetQuery);
	
	public List<BandejaFormatoModel> listaFormatosPorEstadoSinFiltro(String estado, Integer limitQuery, Integer offsetQuery);
	
	public List<BandejaFormatoModel> totalListaFormatosPorEstado(String estado);
}
