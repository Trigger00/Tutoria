package com.unalm.tutoria.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consejero", catalog = "oficina")
public class ConsejeroEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CICLO", unique = true, nullable = false)
	private String ciclo;
	
	
	@Column(name = "ESP_CODIGO")
	private String espCodigo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pro_codigo", nullable = false)
	private Profesor profesor;
	
	public ConsejeroEntity() {
		super();
	}

	public ConsejeroEntity(String ciclo, String proCodigo, String espCodigo,
			Profesor profesor) {
		super();
		this.ciclo = ciclo;
		this.espCodigo = espCodigo;
		this.profesor = profesor;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}


	public String getEspCodigo() {
		return espCodigo;
	}

	public void setEspCodigo(String espCodigo) {
		this.espCodigo = espCodigo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
