package com.yassine.service;

import java.util.List;

import com.yassine.entities.CommandeClient;

public interface ICommandeClientService {
	public CommandeClient save(CommandeClient entity);
	public CommandeClient update(CommandeClient entity);
	public List<CommandeClient> selectAll();
	public List<CommandeClient> selectAll(String sortfiled, String sort);
	public CommandeClient getById(long id);
	public void remove(long id);
	public CommandeClient findOne(String parName,String paramValue );
	public CommandeClient findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
