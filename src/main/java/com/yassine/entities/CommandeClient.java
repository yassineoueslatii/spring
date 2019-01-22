package com.yassine.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnore;
@Entity
public class CommandeClient implements Serializable {
@Id
@GeneratedValue
private long idCommandeClient;
private String codeCommandeClient;
@Transient
BigDecimal totalCommande;
@Transient
List<CommandeClient> lignecdecli;
public BigDecimal getTotalCommande() {
	if(!ligneCommandeClients.isEmpty()) {
		BigDecimal totligne;
		for (LigneCommandeClient ligneCommandeClient:ligneCommandeClients) {
			totligne=ligneCommandeClient.getPrixunitaire().multiply(ligneCommandeClient.getQuantite());
			totalCommande=totalCommande.add(totligne);
			
		}
		
	}
	return totalCommande;
}
public CommandeClient() {
	super();
	// TODO Auto-generated constructor stub
}
public long getIdCommandeClient() {
	return idCommandeClient;
}
public void setIdCommandeClient(long idCommandeClient) {
	this.idCommandeClient = idCommandeClient;
}
public String getCodeCommandeClient() {
	return codeCommandeClient;
}
public void setCodeCommandeClient(String codeCommandeClient) {
	this.codeCommandeClient = codeCommandeClient;
}
public Date getDateCommande() {
	return dateCommande;
}
public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
@JsonIgnore
public Set<LigneCommandeClient> getLigneCommandeClients() {
	return ligneCommandeClients;
}
public void setLigneCommandeClients(Set<LigneCommandeClient> ligneCommandeClients) {
	this.ligneCommandeClients = ligneCommandeClients;
}
@Temporal(TemporalType.TIMESTAMP)
private Date dateCommande;
@ManyToOne
@JoinColumn(name="idClient")
private Client client ;
@OneToMany(mappedBy="commandeClient")
private Set<LigneCommandeClient> ligneCommandeClients ;

public void setLigneCommandeClients(List<CommandeClient> lignecdecli) {
	// TODO Auto-generated method stub
	this.lignecdecli=lignecdecli;
	
}


}
