package com.yassine.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class CommandeFournisseur implements Serializable {
@Id
@GeneratedValue
private long idCommandeFournisseur;
private String codeCommandeFournisseur;
public CommandeFournisseur() {
	super();
	// TODO Auto-generated constructor stub
}
public long getIdCommandeFournisseur() {
	return idCommandeFournisseur;
}
public void setIdCommandeFournisseur(long idCommandeFournisseur) {
	this.idCommandeFournisseur = idCommandeFournisseur;
}
public String getCodeCommandeFournisseur() {
	return codeCommandeFournisseur;
}
public void setCodeCommandeFournisseur(String codeCommandeFournisseur) {
	this.codeCommandeFournisseur = codeCommandeFournisseur;
}
public Date getDateCommande() {
	return dateCommande;
}
public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}
public Fournisseur getFournisseur() {
	return fournisseur;
}
public void setFournisseur(Fournisseur fournisseur) {
	this.fournisseur = fournisseur;
}
public Set<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
	return ligneCommandeFournisseurs;
}
public void setLigneCommandeFournisseurs(Set<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
	this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
}
@Temporal(TemporalType.TIMESTAMP)
private Date dateCommande;
@ManyToOne
@JoinColumn(name="idFournisseur")
private Fournisseur fournisseur;
@OneToMany(mappedBy="commandeFournisseur")
private Set<LigneCommandeFournisseur> ligneCommandeFournisseurs;



}
