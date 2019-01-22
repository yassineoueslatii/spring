package com.yassine.service.Impl;

import java.util.List;

import com.yassine.dao.ICommandeClientDao;
import com.yassine.entities.CommandeClient;
import com.yassine.service.ICommandeClient;
import com.yassine.service.ICommandeClientService;

public class CommandeClientServiceImpl implements ICommandeClientService {
	ICommandeClientDao dao;
	
	public ICommandeClientDao getDao() {
		return dao;
	}

	public void setDao(ICommandeClientDao dao) {
		this.dao = dao;
	}

	@Override
	public CommandeClient save(CommandeClient entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public CommandeClient update(CommandeClient entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<CommandeClient> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<CommandeClient> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortfiled, sort);
	}

	@Override
	public CommandeClient getById(long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
		
	}

	@Override
	public CommandeClient findOne(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(parName, paramValue);
	}

	@Override
	public CommandeClient findOne(String[] paraNames, String[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paraNames, paramValues);
	}

	@Override
	public int findCountBy(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(parName, paramValue);
	}
	

}
