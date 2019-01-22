package com.yassine.dao;

import java.io.InputStream;

public interface IFlickrDao {
public String save(InputStream stream ,String filename) throws Exception;
}
