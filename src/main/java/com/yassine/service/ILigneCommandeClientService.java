package com.yassine.service;

import java.util.List;

import com.yassine.entities.CommandeClient;
import com.yassine.entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
	public LigneCommandeClient save(LigneCommandeClient entity);
	public LigneCommandeClient update(LigneCommandeClient entity);
	public List<LigneCommandeClient> selectAll();
	public List<LigneCommandeClient> selectAll(String sortfiled, String sort);
	public LigneCommandeClient getById(long id);
	public void remove(long id);
	public LigneCommandeClient findOne(String parName,String paramValue );
	public LigneCommandeClient findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );
	public List<CommandeClient> getByIdCommande(long idCommandeClient);
}
