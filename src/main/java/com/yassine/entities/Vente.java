package com.yassine.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Vente implements Serializable {
public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}
public long getIdVente() {
		return idVente;
	}
	public void setIdVente(long idVente) {
		this.idVente = idVente;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Set<LigneVente> getLigneVentes() {
		return ligneVentes;
	}
	public void setLigneVentes(Set<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
@Id
@GeneratedValue
private long idVente;
private String code;
@Temporal(TemporalType.TIMESTAMP)
private Date date;
@OneToMany(mappedBy="vente")
private Set<LigneVente> ligneVentes;


}
