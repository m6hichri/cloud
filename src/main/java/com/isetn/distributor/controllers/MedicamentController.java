package com.isetn.distributor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.isetn.distributor.entities.Medicament;
import com.isetn.distributor.service.MedicamentService;


// spring go understand servlet controller
@Controller 
public class MedicamentController {
	
	
	@Autowired
	MedicamentService produitService;
// api
	//don't put .jsp in the end of createProduit because in file appliacation.properties we indicated 
	//the extension of all files of view ".jsp"
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createMedicament"; //createProduit it is a view 
	}
	
	
	//instancier un objet de type produit @ModelAttribute("produit")
	@RequestMapping("/saveProduit")
	public String saveProduit(@ModelAttribute("produit") Medicament produit,ModelMap modelMap) 
	{
		 Medicament saveProduit = produitService.saveProduit(produit);
		 String msg ="produit enregistré avec Id "+saveProduit.getIdMedicament();
		 modelMap.addAttribute("msg", msg);
		return "createMedicament";
	}
	
	
	@RequestMapping("/ListeMedicaments")
	public String listeProduits(ModelMap modelMap)
	{
		List<Medicament> prods = produitService.getAllProduits();
		modelMap.addAttribute("produits", prods);		
		return "listeMedicaments";	
	}
	
	@RequestMapping("/supprimerProduit")
	public String supprimerProduit(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Medicament p= new Medicament();
		p.setIdMedicament(id);
		produitService.deleteProduit(p);
		List<Medicament> prods = produitService.getAllProduits();
		modelMap.addAttribute("produits", prods);	
		return "listeMedicaments";	
	}
	
	@RequestMapping("/modifierProduit")
	public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Medicament p= 	produitService.getProduit(id);
		modelMap.addAttribute("produit", p);	
		return "editerMedicament";	
	}
	
	@RequestMapping("/updateProduit")
	public String updateProduit(@ModelAttribute("produit") Medicament produit,ModelMap modelMap) 
	{
		  produitService.updateProduit(produit);
		  List<Medicament> prods = produitService.getAllProduits();
		  modelMap.addAttribute("produits", prods);	
		
		return "listeMedicaments";
	}

}
