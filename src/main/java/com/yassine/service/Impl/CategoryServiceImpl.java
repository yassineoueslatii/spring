package com.yassine.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.yassine.dao.ICategoryDao;
import com.yassine.service.ICategoryService;
@Transactional
public class CategoryServiceImpl implements ICategoryService {
private ICategoryDao dao;

	
	public void setDao(ICategoryDao dao) {
	this.dao = dao;
}

	@Override
	public com.yassine.entities.Category save(com.yassine.entities.Category entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public com.yassine.entities.Category update(com.yassine.entities.Category entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<com.yassine.entities.Category> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<com.yassine.entities.Category> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortfiled, sort);
	}

	@Override
	public com.yassine.entities.Category getById(long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public com.yassine.entities.Category findOne(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(parName, paramValue);
	}

	@Override
	public com.yassine.entities.Category findOne(String[] paraNames, String[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paraNames, paramValues);
	}

	@Override
	public int findCountBy(String parName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(parName, paramValue);
	}

}
