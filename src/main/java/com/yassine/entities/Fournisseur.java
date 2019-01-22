package com.yassine.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Fournisseur implements Serializable {
@Id
@GeneratedValue
private long id;
private String nom;
private String prenom;
private String photo;
private String email;
public Fournisseur() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Set<CommandeFournisseur> getCommandeFournisseurs() {
	return commandeFournisseurs;
}
public void setCommandeFournisseurs(Set<CommandeFournisseur> commandeFournisseurs) {
	this.commandeFournisseurs = commandeFournisseurs;
}
@OneToMany(mappedBy="fournisseur")
private Set<CommandeFournisseur> commandeFournisseurs;





}
