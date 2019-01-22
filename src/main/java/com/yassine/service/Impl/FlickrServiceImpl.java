package com.yassine.service.Impl;

import java.io.InputStream;

import com.yassine.dao.IFlickrDao;
import com.yassine.service.IFlickrService;

public class FlickrServiceImpl implements IFlickrService {
	private IFlickrDao dao;
	

	public IFlickrDao getDao() {
		return dao;
	}


	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}


	@Override
	public String save(InputStream stream, String filename) throws Exception {
		// TODO Auto-generated method stub
		return dao.save(stream, filename);
	}

}
