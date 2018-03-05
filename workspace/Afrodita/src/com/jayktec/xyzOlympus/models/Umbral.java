package com.jayktec.xyzOlympus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.NoCreate;
import org.openxava.annotations.NoModify;
/*
Table: fateon_umbral
Columns:
umbral_id varchar(32) PK 
origen_id varchar(32) 
sensor_id varchar(32) 
mapa_id varchar(32) 
umbral_valor float*/
@Entity
@Table(name="fateon_umbral")
public class Umbral {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@Hidden
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(name="umbral_id",length=32)
	private String oid; 
	
	
	@Column(name="umbral_valor",length=32)
	private String umbralValor;
	
	@NoModify
	@NoCreate
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="origen_id",insertable=true,updatable=true)
	private Origen origen;
	
	@NoModify
	@NoCreate
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="mapa_id",insertable=true,updatable=true)
	private Mapa mapa;

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getUmbralValor() {
		return umbralValor;
	}

	public void setUmbralValor(String umbralValor) {
		this.umbralValor = umbralValor;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	


}