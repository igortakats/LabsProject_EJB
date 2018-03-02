package br.com.igita.labs.ejb.service;

import java.util.List;

import javax.ejb.Stateless;

import br.gov.sp.prodesp.grtpv2.entities.Preso;

@Stateless
public class LabsPresoServiceImpl implements LabsPresoServiceLocal, LabsPresoServiceRemote {

	private static final long serialVersionUID = -8514787234418710000L;
	
	private List<Preso> listPresos;

	@Override
	public List<Preso> filtrados(FiltroPreso filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int quantidadeFiltrados(FiltroPreso filtro) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
