package com.yassine.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client implements Serializable {
@Id
@GeneratedValue
private long idClient;
private String nom;
private String prenom;
private String photo;
private String mail;
private String addresse;
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getAddresse() {
	return addresse;
}
public void setAddresse(String addresse) {
	this.addresse = addresse;
}
public Set<CommandeClient> getCommandeClients() {
	return commandeClients;
}
public void setCommandeClients(Set<CommandeClient> commandeClients) {
	this.commandeClients = commandeClients;
}
@OneToMany(mappedBy ="client")
private Set<CommandeClient> commandeClients ;
public Set<CommandeClient> getCommandeClient() {
	return commandeClients;
}
public void setCommandeClient(Set<CommandeClient> commandeClient) {
	this.commandeClients = commandeClient;
}
public Client() {
	super();
	// TODO Auto-generated constructor stub
}
public long getIdClient() {
	return idClient;
}
public void setIdClient(long idClient) {
	this.idClient = idClient;
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
private String email;

}
