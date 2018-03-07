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
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.NoCreate;
import org.openxava.annotations.NoModify;
import org.openxava.annotations.ReferenceView;
/*
Table: fateon_umbral
Columns:
umbral_id varchar(32) PK 
sensor_id varchar(32) 
origen_id varchar(32) 
mapa_id varchar(32) 
umbral float
*/
@Entity
@Table(name="fateon_umbral")
public class Umbral {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@Hidden
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(name="umbral_id",length=32)
	private String oid; 
	
	
	@Column(name="umbral",length=32)
	private float umbralValor;
	
	@NoModify
	@NoCreate
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="origen_id",insertable=true,updatable=true)
	@DescriptionsList(
			showReferenceView=true,
			descriptionProperties="nombre")  
	@ReferenceView("VOrigenenUmbral")
	private Origen origen;
	
	
	@NoModify
	@NoCreate
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@DescriptionsList(condition="e.oid in( SELECT c.oid FROM Origen c, Umbral t"
			+ " where c.oid = t.oid and ${origen.oid} = ?)",
			showReferenceView=false,
			descriptionProperties="nombre",depends="origen")  
	private Sensor sensor;
	
	

	@NoModify
	@NoCreate
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="mapa_id",insertable=true,updatable=true)
	@DescriptionsList(condition="e.oid in( SELECT c.oid FROM Mapa c, Umbral t"
			+ " where c.oid = t.oid and ${sensor.oid} = ?)",
			showReferenceView=false,
			descriptionProperties="nombre",depends="sensor")  
	private Mapa mapa;
	

	
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}


	public float getUmbralValor() {
		return umbralValor;
	}

	public void setUmbralValor(float umbralValor) {
		this.umbralValor = umbralValor;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
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
