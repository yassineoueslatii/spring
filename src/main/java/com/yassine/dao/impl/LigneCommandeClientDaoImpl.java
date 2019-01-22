package com.yassine.dao.impl;

import java.util.List;

import javax.persistence.Query;

import com.yassine.dao.ICategoryDao;
import com.yassine.dao.ILigneCommandeClientDao;
import com.yassine.entities.Category;
import com.yassine.entities.CommandeClient;
import com.yassine.entities.LigneCommandeClient;

public class LigneCommandeClientDaoImpl extends GenericDaoImpl<LigneCommandeClient> implements ILigneCommandeClientDao {

	@Override
	public List<CommandeClient> getByIdCommande(long idCommandeClient) {
		String queryString="select lc from " + LigneCommandeClient.class.getSimpleName() + " lc where lc.commandeClient.idCommandeClient = :x";
		Query query=em.createQuery(queryString);
		query.setParameter("x", idCommandeClient);
		return query.getResultList();
		
	}

}
