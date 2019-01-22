package com.yassine.service;

import java.util.List;

import com.yassine.entities.LigneVente;

public interface ILigneVenteService {
	public LigneVente save(LigneVente entity);
	public LigneVente update(LigneVente entity);
	public List<LigneVente> selectAll();
	public List<LigneVente> selectAll(String sortfiled, String sort);
	public LigneVente getById(long id);
	public void remove(long id);
	public LigneVente findOne(String parName,String paramValue );
	public LigneVente findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
