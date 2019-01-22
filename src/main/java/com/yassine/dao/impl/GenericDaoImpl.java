package com.yassine.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.yassine.dao.IGenericDao;
@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E> {
	@PersistenceContext
	EntityManager em;
	private Class<E> type;
	 
	public GenericDaoImpl() {
		Type t =getClass().getGenericSuperclass();
		ParameterizedType pt=(ParameterizedType) t;
		type=(Class<E>) pt.getActualTypeArguments()[0];
		
	}
	public Class<E> getType() {
		return type;
	}
	@Override
	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		// TODO Auto-generated method stub
	
		return em.merge(entity);
	}
	

	@Override
	public List<E> selectAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("select t from " + type.getSimpleName() + " t ");
		
		return query.getResultList();
	}

	@Override
	public List<E> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		Query query= em.createQuery("select t from"+type.getSimpleName()+"t order by "+sortfiled+" "+sort);
		return query.getResultList();
	}

	@Override
	public E getById(long id) {
	
		return em.find(type,id);
	}

	@Override
	public void remove(long id) {
		E tab=em.getReference(type, id);
		 em.remove(tab);
		
		
	}

	@Override
	public E findOne(String parName, String paramValue) {
		Query query= em.createQuery("select t from"+type.getSimpleName()+"t where "+ parName+" =:x");
		query.setParameter(parName, paramValue);
		return query.getResultList().size()>0? (E)query.getResultList().get(0):null;
		
	}

	@Override
	public E findOne(String[] paraNames, String[] paramValues) {
		if (paraNames.length!=paramValues.length) {
			return null;
		}
		String queryString = "select e from "+type.getSimpleName()+" e where ";
		int len=paraNames.length;
		for (int i=0;i<len;i++)
		{
			queryString +=" e."+paraNames[i]+ "= :x"+ i;
			if ((i+1)<len) {
				queryString+=" and ";
			}
		}
		Query query=em.createQuery(queryString);
		for (int i=0;i<paramValues.length;i++) {
			query.setParameter("x"+i, paramValues[i]);
			
		}
		return query.getResultList().size()>0? (E) query.getResultList().get(0):null;
	}

	@Override
	public int findCountBy(String parName, String paramValue) {
		Query query= em.createQuery("select t from"+type.getSimpleName()+"t where "+ parName+" =:x");
		query.setParameter(parName, paramValue);
		if (query.getResultList().size()>0)
			return 1;
		else
			return 0;
	}
	

}
