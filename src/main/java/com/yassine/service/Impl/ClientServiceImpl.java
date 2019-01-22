package com.yassine.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.yassine.dao.IClientDao;
import com.yassine.service.IClientService;
import com.yassine.service.ICommandeClient;
@Transactional
public class ClientServiceImpl implements IClientService{
private IClientDao dao;

	public void setDao(IClientDao dao) {
	this.dao = dao;
}

	@Override
	public com.yassine.entities.Client save(com.yassine.entities.Client entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public com.yassine.entities.Client update(com.yassine.entities.Client entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<com.yassine.entities.Client> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<com.yassine.entities.Client> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortfiled, sort);
	}

	@Override
	public com.yassine.entities.Client getById(long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.yassine.entities.Client findOne(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(parName, paramValue);
	}

	@Override
	public com.yassine.entities.Client findOne(String[] paraNames, String[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paraNames, paramValues);
	}

	@Override
	public int findCountBy(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(parName, paramValue);
	}

}
