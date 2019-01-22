package com.yassine.dao;

import java.util.List;

import com.yassine.entities.CommandeClient;
import com.yassine.entities.LigneCommandeClient;

public interface ILigneCommandeClientDao extends IGenericDao<LigneCommandeClient> {
	public List<CommandeClient> getByIdCommande(long idCommandeClient);

}
