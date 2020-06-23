package com.camaratek.catalogue_pro_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.camaratek.catalogue_pro_mvc.entities.Produit;
import com.camaratek.catalogue_pro_mvc.repositories.ProduitRepository;

@SpringBootApplication
public class CatalogueProMvcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CatalogueProMvcApplication.class, args);
		ProduitRepository  produitRepository = ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit(null, "LX 4352", 670, 90));
		produitRepository.save(new Produit(null, "Ordinateur HP 325", 970, 50));
		produitRepository.save(new Produit(null, "Imprimante Epson", 370, 100));
		produitRepository.save(new Produit(null, "Clavier", 70, 290));
		
		produitRepository.findAll().forEach(p ->System.out.println(p.getDesignation()));
	} 

}
