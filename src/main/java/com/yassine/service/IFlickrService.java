package com.yassine.service;

import java.io.InputStream;

public interface IFlickrService {
	public String save(InputStream stream ,String filename) throws Exception;
	}

