package com.yassine.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Utilisateur implements Serializable {
public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
@GeneratedValue
private long idUtilisateur;
public long getIdUtilisateur() {
	return idUtilisateur;
}
public void setIdUtilisateur(long idUtilisateur) {
	this.idUtilisateur = idUtilisateur;
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
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getMotDePasse() {
	return motDePasse;
}
public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
private String nom;
private String prenom;
private String mail;
private String motDePasse;
private String photo;

}
