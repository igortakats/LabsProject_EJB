package br.com.igita.labs.ejb.entities;

import java.io.Serializable;

import br.gov.sp.prodesp.grtpv2.entities.Preso;

public class LabsPreso implements Serializable{
	
	private static final long serialVersionUID = -7201852692135199190L;
	
	private Preso preso;

	public Preso getPreso() {
		return preso;
	}

	public void setPreso(Preso preso) {
		this.preso = preso;
	}
	

}
