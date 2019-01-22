package com.yassine.dao;

import java.util.List;

public interface IGenericDao<E> {
	
public E save(E entity);
public E update(E entity);
public List<E> selectAll();
public List<E> selectAll(String sortfiled, String sort);
public E getById(long id);
public void remove(long id);
public E findOne(String parName,String paramValue );
public E findOne(String[] paraNames,String[] paramValues );
public int findCountBy(String parName,String paramValue );


}
