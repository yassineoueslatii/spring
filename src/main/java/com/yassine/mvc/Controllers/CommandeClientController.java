package com.yassine.mvc.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yassine.entities.Client;
import com.yassine.entities.CommandeClient;
import com.yassine.service.IArticleService;
import com.yassine.service.IClientService;
import com.yassine.service.ICommandeClientService;
import com.yassine.service.ILigneCommandeClientService;

@Controller
@RequestMapping("/commandeclient")
public class CommandeClientController {

	
	@Autowired
	ILigneCommandeClientService lignecommandeclient;
	
	@Autowired
	ICommandeClientService commandeclientservice;
	@Autowired
	IClientService clientService;
	@Autowired
	IArticleService articleservice;
	@RequestMapping("/")
	public String index(Model model) {
		List<CommandeClient> commandesclient=commandeclientservice.selectAll();
		if(commandesclient==null) {
			commandesclient=new ArrayList<CommandeClient>();
		}
		else {
			for(CommandeClient commandeclient : commandesclient) {
				List<CommandeClient> lignecdecli=lignecommandeclient.getByIdCommande(commandeclient.getIdCommandeClient());
				commandeclient.setLigneCommandeClients(lignecdecli);
			}
		}
		model.addAttribute("commandeclient", commandesclient);
	
		
		return "commandeclient/commandeclient";
	}

}
