package com.yassine.service;

import java.util.List;

import com.yassine.entities.Category;

public interface ICategoryService {
	public Category save(Category entity);
	public Category update(Category entity);
	public List<Category> selectAll();
	public List<Category> selectAll(String sortfiled, String sort);
	public Category getById(long id);
	public void remove(long id);
	public Category findOne(String parName,String paramValue );
	public Category findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
