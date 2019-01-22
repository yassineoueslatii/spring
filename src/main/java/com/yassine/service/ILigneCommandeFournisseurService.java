package com.yassine.service;

import java.util.List;

import com.yassine.entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
	public List<LigneCommandeFournisseur> selectAll();
	public List<LigneCommandeFournisseur> selectAll(String sortfiled, String sort);
	public LigneCommandeFournisseur getById(long id);
	public void remove(long id);
	public LigneCommandeFournisseur findOne(String parName,String paramValue );
	public LigneCommandeFournisseur findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
