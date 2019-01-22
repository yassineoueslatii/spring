package com.yassine.dao.impl;

import java.io.InputStream;

import javax.swing.JOptionPane;

import org.scribe.model.Verifier;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.yassine.dao.IFlickrDao;

import antlr.Token;

public class FlickrDaoImlp implements IFlickrDao {
	private Flickr flickr;
	private UploadMetaData uploadMetaData = new UploadMetaData();
	private String apiKey="676f1740c2a58e19306077ff4066540f";
	private String sharedSecret= "96a1b78573dc98a1";
	
	private void connect() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		Auth auth= new Auth();
		auth.setPermission(Permission.READ);
		auth.setToken("72157705813180255-9ce8f857a6ca22f2");
		auth.setTokenSecret("577e6c9c478d8257");
		RequestContext requestContext = RequestContext.getRequestContext();
		requestContext.setAuth(auth);
		flickr.setAuth(auth);
	}
	public void auth() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		AuthInterface authInterface = flickr.getAuthInterface();
		org.scribe.model.Token token= authInterface.getRequestToken();
		System.out.println("token"+token);
		String url=authInterface.getAuthorizationUrl(token, Permission.DELETE);
		System.out.println("Follow this URL to authorise Yourself on Flickr");
		System.out.println(url);
		String tokenKey =JOptionPane.showInputDialog(null);
		org.scribe.model.Token requestToken =authInterface.getAccessToken(token, new Verifier(tokenKey));
		System.out.println("Success Authentification");
		Auth auth =null;
		
		try {
			auth =authInterface.checkToken(requestToken);
		}
		catch(FlickrException e) {
			e.printStackTrace();
		}
		System.out.println("Token:"+requestToken.getToken());
		System.out.println("Secret:"+requestToken.getSecret());
		System.out.println("id:"+auth.getUser().getId());
		System.out.println("RealName"+auth.getUser().getRealName());
		System.out.println("UserName:"+auth.getUser().getUsername());
		System.out.println("Permission"+auth.getPermission().getType());
		
	}

	@Override
	public String save(InputStream stream, String filename) throws Exception {
		
		connect();
		uploadMetaData.setTitle(filename);
		String photoId=flickr.getUploader().upload(stream, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}

}
