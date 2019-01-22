package com.yassine.service;

import java.util.List;

import com.yassine.entities.Vente;

public interface IVenteService {
	public Vente save(Vente entity);
	public Vente update(Vente entity);
	public List<Vente> selectAll();
	public List<Vente> selectAll(String sortfiled, String sort);
	public Vente getById(long id);
	public void remove(long id);
	public Vente findOne(String parName,String paramValue );
	public Vente findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
