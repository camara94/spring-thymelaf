package com.camaratek.catalogue_pro_mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.camaratek.catalogue_pro_mvc.repositories.ProduitRepository;

@Controller
public class ProduitController {
	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping(value = "index")
	public String index(Model model) {
		model.addAttribute("listProduits", this.produitRepository.findAll());
		return "produits";
	}
	
}
