package com.unalm.tutoria.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Alumnos")
public class AlumnosEntity implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="matricula")
	private String matricula;
	
	@Column(name="pro_codigo")
	private String pro_codigo;
	
	@Column(name="fac_codigo")
	private String fac_codigo;
	
	@Column(name="esp_codigo")
	private String esp_codigo;
	
	@Column(name="situacion")
	private String situacion;
	
	@Column(name="alu_nombre")
	private String alu_nombre;

	@Column(name="esp_grad")
	private String esp_grad ;
	
	@Column(name="ciclo_ult")
	private String ciclo_ult;
	
	@Column(name="ciclo_r")
	private String ciclo_r;
	
	@Column(name="email")
	private String email;
	
	@Column(name="curricula")
	private String curricula;

	@Column(name="perso")
	private String perso;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="cambio_curricula")
	private String cambio_curricula;
	
	@Column(name="fl_no_censado")
	private String fl_no_censado;
	
	@Column(name="convenio")
	private String convenio;
/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matricula")
	private Set<Consejeria> consejeria = new HashSet<Consejeria>(0);
	
*/

}
