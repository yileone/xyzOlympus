package com.jayktec.xyzOlympus.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.Hidden;
import org.openxava.calculators.CurrentDateCalculator;

/*Table: contrato_extras
Columns:
extra_id int(11) PK 
contrato_id int(11) 
fechaRegistro timestamp 
fechaInicio date 
fechaFin date 
funcionario_id int(11)*/

@Entity
@Table(name="contrato_extras")
public class Adicional {
	
	@Id
	@Hidden
	@Column(name="extra_id",length=11)
	private int oid;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="contrato_id",insertable=true,updatable=true)
	private Contrato contrato;
	
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="funcionario_id",insertable=true,updatable=true)
	private Funcionario funcionario;
	
	@Column(name="fechaInicio",length=10)
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date fechaInicio;

	@Column(name="FechaFin",length=10)
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date FechaFin;
	

}
