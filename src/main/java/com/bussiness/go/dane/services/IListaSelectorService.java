package com.bussiness.go.dane.services;

import java.util.List;
import java.util.Map;

import com.bussiness.go.dane.entities.commons.ListaSelector;

public interface IListaSelectorService extends CommonService<ListaSelector, String>{

	public List<ListaSelector> consultarListaSelector(String nombreLista, Map<String, String> filtros);
}
