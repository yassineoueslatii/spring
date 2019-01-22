package com.yassine.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Category implements Serializable{
@Id
@GeneratedValue
private long idCategory;
private String codeCategory;
private String designation;
@OneToMany(mappedBy="category")
private Set<Article> articles;


public Set<Article> getArticles() {
	return articles;
}
public Category() {
	
	// TODO Auto-generated constructor stub
}
public void setArticles(Set<Article> articles) {
	this.articles = articles;
}
public long getIdCategory() {
	return idCategory;
}
public void setIdCategory(long idCategory) {
	this.idCategory = idCategory;
}
public String getCodeCategory() {
	return codeCategory;
}
public void setCodeCategory(String codeCategory) {
	this.codeCategory = codeCategory;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}


}
