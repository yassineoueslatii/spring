package com.yassine.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class MvtStk implements Serializable {
public static final int ENTREE=1;
public static final int SORTIE=2;
@Id
@GeneratedValue
private long idMvtStk;
@Temporal(TemporalType.TIMESTAMP)
private Date dateMvt;
private BigDecimal quantite;
@ManyToOne
@JoinColumn(name="idArticle")
private Article article;
public long getIdMvtStk() {
	return idMvtStk;
}
public void setIdMvtStk(long idMvtStk) {
	this.idMvtStk = idMvtStk;
}
public Date getDateMvt() {
	return dateMvt;
}
public void setDateMvt(Date dateMvt) {
	this.dateMvt = dateMvt;
}
public BigDecimal getQuantite() {
	return quantite;
}
public void setQuantite(BigDecimal quantite) {
	this.quantite = quantite;
}
public Article getArticle() {
	return article;
}
public void setArticle(Article article) {
	this.article = article;
}
public MvtStk() {
	super();
	// TODO Auto-generated constructor stub
}



}
