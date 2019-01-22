package com.yassine.service;

import java.util.List;

import com.yassine.entities.Fournisseur;

public interface IFournisseurService {
	public Fournisseur save(Fournisseur entity);
	public Fournisseur update(Fournisseur entity);
	public List<Fournisseur> selectAll();
	public List<Fournisseur> selectAll(String sortfiled, String sort);
	public Fournisseur getById(long id);
	public void remove(long id);
	public Fournisseur findOne(String parName,String paramValue );
	public Fournisseur findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );
}
