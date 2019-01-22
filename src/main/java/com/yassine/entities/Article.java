package com.yassine.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Article implements Serializable{
@Id
@GeneratedValue
private long idArticle;
private String codeArticle;
private String designation;
private BigDecimal prixUnitaire;
private BigDecimal tauxTva;
private BigDecimal prixUnitaireTTC;
private String photo;
@ManyToOne
@JoinColumn(name="idCategory")
private Category category;
@OneToMany(mappedBy="article")
private Set<LigneCommandeClient> ligneCommandeClients;
@OneToMany(mappedBy="article")
private Set<LigneCommandeFournisseur> ligneCommandeFournisseur;
@OneToMany(mappedBy="article")
private Set<LigneVente> ligneVentes;
@OneToMany(mappedBy="article")
private Set<MvtStk> mvtStks;
public long getIdArticle() {
	return idArticle;
}
public void setIdArticle(long idArticle) {
	this.idArticle = idArticle;
}
public String getCodeArticle() {
	return codeArticle;
}
public void setCodeArticle(String codeArticle) {
	this.codeArticle = codeArticle;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public BigDecimal getPrixUnitaire() {
	return prixUnitaire;
}
public void setPrixUnitaire(BigDecimal prixUnitaire) {
	this.prixUnitaire = prixUnitaire;
}
public BigDecimal getTauxTva() {
	return tauxTva;
}
public void setTauxTva(BigDecimal tauxTva) {
	this.tauxTva = tauxTva;
}
public BigDecimal getPrixUnitaireTTC() {
	return prixUnitaireTTC;
}
public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
	this.prixUnitaireTTC = prixUnitaireTTC;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Set<LigneCommandeClient> getLigneCommandeClients() {
	return ligneCommandeClients;
}
public void setLigneCommandeClients(Set<LigneCommandeClient> ligneCommandeClients) {
	this.ligneCommandeClients = ligneCommandeClients;
}
public Set<LigneCommandeFournisseur> getLigneCommandeFournisseur() {
	return ligneCommandeFournisseur;
}
public void setLigneCommandeFournisseur(Set<LigneCommandeFournisseur> ligneCommandeFournisseur) {
	this.ligneCommandeFournisseur = ligneCommandeFournisseur;
}
public Set<LigneVente> getLigneVentes() {
	return ligneVentes;
}
public void setLigneVentes(Set<LigneVente> ligneVentes) {
	this.ligneVentes = ligneVentes;
}
public Set<MvtStk> getMvtStks() {
	return mvtStks;
}
public void setMvtStks(Set<MvtStk> mvtStks) {
	this.mvtStks = mvtStks;
}
public Article() {
	super();
	// TODO Auto-generated constructor stub
}



}
