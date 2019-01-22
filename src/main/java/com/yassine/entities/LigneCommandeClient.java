package com.yassine.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.codehaus.jackson.annotate.JsonIgnore;
@Entity
public class LigneCommandeClient implements Serializable {
@Id
@GeneratedValue
private long idLingeCommandeClient;
private BigDecimal quantite;
private BigDecimal prixunitaire;

public long getIdLingeCommandeClient() {
	return idLingeCommandeClient;
}
public void setIdLingeCommandeClient(long idLingeCommandeClient) {
	this.idLingeCommandeClient = idLingeCommandeClient;
}
public BigDecimal getQuantite() {
	return quantite;
}
public void setQuantite(BigDecimal quantite) {
	this.quantite = quantite;
}
public BigDecimal getPrixunitaire() {
	return prixunitaire;
}
public void setPrixunitaire(BigDecimal prixunitaire) {
	this.prixunitaire = prixunitaire;
}
@ManyToOne
@JoinColumn(name="idArticle")
private Article article;
@ManyToOne
@JoinColumn(name="idcCommandeClient")
private CommandeClient commandeClient;
@JsonIgnore
public Article getArticle() {
	return article;
}
public void setArticle(Article article) {
	this.article = article;
}
@JsonIgnore
public CommandeClient getCommandeClient() {
	return commandeClient;
}
public void setCommandeClient(CommandeClient commandeClient) {
	this.commandeClient = commandeClient;
}
public LigneCommandeClient() {
	super();
	// TODO Auto-generated constructor stub
}

}
