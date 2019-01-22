package com.yassine.mvc.Controllers;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.yassine.entities.Client;
import com.yassine.service.IClientService;
import com.yassine.service.IFlickrService;

@Controller
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private IClientService clientService;
	@Autowired
	private IFlickrService flickrService;
	
	@RequestMapping("/")
	public String client(Model model) {
	List<Client> clients=clientService.selectAll();
	if(clients==null) {
		clients=new ArrayList<Client>();
	}
	model.addAttribute("clients", clients);
	return "client/client";	
	}
	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterClient(Model model) {
		Client client= new Client();
		client.setNom("Yassine");
		model.addAttribute("client", client);
		return "client/ajout";
	}
	@RequestMapping(value = "/nouveau", method = RequestMethod.POST)
	public String enregistrerClient(Model model , Client client, MultipartFile file) throws Exception {
		if(client!=null) {
		if (file!=null && !file.isEmpty()) {
			String photoUrl=null;
			InputStream stream=file.getInputStream();
			photoUrl=flickrService.save(stream, client.getNom());
			client.setPhoto(photoUrl);}
			long f=client.getIdClient();
			if(Long.valueOf(f)!=null) {
				clientService.update(client);
			}
			else {
			clientService.save(client);
			}
			
		
		}
		return "redirect:/client/";
	}
	@RequestMapping(value ="/modifier/{idClient}")
	public String modifier(Model model,@PathVariable long idClient) {
		
		Client client=clientService.getById(idClient);
		long f=client.getIdClient();
		if(Long.valueOf(f)!=null) {
		model.addAttribute("client", client);	
		}
		
		
		
		return"client/ajout";
	}
	@RequestMapping(value="/supprimer/{idClient}/")
	public String supprimer(@PathVariable long idClient) {
		clientService.remove(idClient);
		return "redirect:/client/";
	}

}
