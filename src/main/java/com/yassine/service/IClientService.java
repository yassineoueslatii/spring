package com.yassine.service;

import java.util.List;

import com.yassine.entities.Client;

public interface IClientService {
	public Client save(Client entity);
	public Client update(Client entity);
	public List<Client> selectAll();
	public List<Client> selectAll(String sortfiled, String sort);
	public Client getById(long id);
	public void remove(long id);
	public Client findOne(String parName,String paramValue );
	public Client findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
