package com.yassine.service;

import java.util.List;

import com.yassine.entities.MvtStk;

public interface IMvtStkService {
	public MvtStk save(MvtStk entity);
	public MvtStk update(MvtStk entity);
	public List<MvtStk> selectAll();
	public List<MvtStk> selectAll(String sortfiled, String sort);
	public MvtStk getById(long id);
	public void remove(long id);
	public MvtStk findOne(String parName,String paramValue );
	public MvtStk findOne(String[] paraNames,String[] paramValues );
	public int findCountBy(String parName,String paramValue );
}
