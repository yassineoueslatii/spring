package com.yassine.mvc;

import java.io.FileInputStream;
import java.io.InputStream;

import com.yassine.dao.impl.FlickrDaoImlp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlickrDaoImlp flickr=new FlickrDaoImlp();
		//flickr.auth();
		try {
			InputStream stream =new FileInputStream("c:\\yassine.jpg");
			String url =flickr.save(stream, "My Image");
			System.out.println(url);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
