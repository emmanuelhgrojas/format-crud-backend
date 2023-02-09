package com.bussiness.go.dane.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bussiness.go.dane.entities.commons.BandejaFormatoModel;
import com.bussiness.go.dane.entities.commons.BandejaUsuarioModel;

@Repository
public interface IBandejaFormatoRepository extends JpaRepository<BandejaFormatoModel, UUID>{

	@Query(value ="SELECT v.viaje_id, v.formato_pais_residencia, v.formato_nacionalidad, v.formato_sexo, v.formato_edad  FROM formularios.viaje as v \n"
			+ "WHERE v.formato_estado = :estado AND \n"
			+ "(v.viaje_id LIKE %:filtro% OR v.formato_pais_residencia LIKE %:filtro% OR v.formato_nacionalidad LIKE %:filtro% OR v.formato_sexo LIKE %:filtro% OR v.formato_edad LIKE %:filtro%)\n"
			+ "limit :limitQuery offset :offsetQuery", nativeQuery = true)
	public List<BandejaFormatoModel> listaFormatosPorEstadoConFiltro(String filtro, String estado, Integer limitQuery, Integer offsetQuery);
	
	@Query(value ="SELECT v.viaje_id, v.formato_pais_residencia, v.formato_nacionalidad, v.formato_sexo, v.formato_edad  FROM formularios.viaje as v \n"
			+ "WHERE v.formato_estado = :estado\n"			
			+ "limit :limitQuery offset :offsetQuery", nativeQuery = true)
	public List<BandejaFormatoModel> listaFormatosPorEstadoSinFiltro(String estado, Integer limitQuery, Integer offsetQuery);
	
	@Query(value ="SELECT v.viaje_id, v.formato_pais_residencia, v.formato_nacionalidad, v.formato_sexo, v.formato_edad  FROM formularios.viaje as v WHERE formato_estado = :estado\n", nativeQuery = true)
	public List<BandejaFormatoModel> totalListaFormatosPorEstado(String estado);
}
