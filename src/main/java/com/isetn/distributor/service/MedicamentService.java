package com.isetn.distributor.service;

import java.util.List;

import com.isetn.distributor.entities.Medicament;


// all operations that relates to the product i can do it in this interface 
public interface MedicamentService {
	
	 Medicament saveProduit(Medicament p);
	 Medicament updateProduit(Medicament p);
	 void deleteProduit(Medicament p);
	 Medicament getProduit(Long id);
	 List<Medicament> getAllProduits();

}
