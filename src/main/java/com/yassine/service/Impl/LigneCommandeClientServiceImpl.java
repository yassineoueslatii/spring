package com.yassine.service.Impl;

import java.util.List;

import com.yassine.dao.ILigneCommandeClientDao;
import com.yassine.entities.CommandeClient;
import com.yassine.entities.LigneCommandeClient;
import com.yassine.service.ILigneCommandeClientService;

public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {
	ILigneCommandeClientDao dao;
	

	public void setDao(ILigneCommandeClientDao dao) {
		this.dao = dao;
	}

	public ILigneCommandeClientDao getDao() {
		return dao;
	}

	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortfiled, sort);
	}

	@Override
	public LigneCommandeClient getById(long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeClient findOne(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(parName, paramValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paraNames, String[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paraNames, paramValues);
	}

	@Override
	public int findCountBy(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(parName, paramValue);
	}

	@Override
	public List<CommandeClient> getByIdCommande(long idCommandeClient) {
		// TODO Auto-generated method stub
		return dao.getByIdCommande(idCommandeClient);
	}

}
