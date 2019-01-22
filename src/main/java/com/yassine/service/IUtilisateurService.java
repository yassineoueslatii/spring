package com.yassine.service;

import java.util.List;

import com.yassine.entities.Utilisateur;

public interface IUtilisateurService {
	public Utilisateur save(Utilisateur entity);
	public Utilisateur update(Utilisateur entity);
	public List<Utilisateur> selectAll();
	public List<Utilisateur> selectAll(String sortfiled, String sort);
	public Utilisateur getById(long id);
	public void remove(long id);
	public Utilisateur findOne(String parName,String paramValue );
	public Utilisateur findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );

}
