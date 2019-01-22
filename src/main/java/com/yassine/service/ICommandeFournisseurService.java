package com.yassine.service;

import java.util.List;

import com.yassine.entities.CommandeFournisseur;

public interface ICommandeFournisseurService {
	public CommandeFournisseur save(CommandeFournisseur entity);
	public CommandeFournisseur update(CommandeFournisseur entity);
	public List<CommandeFournisseur> selectAll();
	public List<CommandeFournisseur> selectAll(String sortfiled, String sort);
	public CommandeFournisseur getById(long id);
	public void remove(long id);
	public CommandeFournisseur findOne(String parName,String paramValue );
	public CommandeFournisseur findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
