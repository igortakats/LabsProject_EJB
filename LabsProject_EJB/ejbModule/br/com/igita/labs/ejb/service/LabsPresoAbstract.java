package br.com.igita.labs.ejb.service;

import java.io.Serializable;
import java.util.List;

import br.gov.sp.prodesp.grtpv2.entities.Preso;

public interface LabsPresoAbstract extends Serializable {
	
	List<Preso> filtrados(FiltroPreso filtro);

	int quantidadeFiltrados(FiltroPreso filtro);

}
