package com.isetn.distributor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isetn.distributor.entities.Medicament;
import com.isetn.distributor.repos.MedicamentRepository;

@Service
public class MedicamentServiceImpl implements MedicamentService {

	// it is very important 
	@Autowired
	MedicamentRepository produitRepository;
	
	@Override
	public Medicament saveProduit(Medicament p) {
		return produitRepository.save(p);
		
	}

	@Override
	public Medicament updateProduit(Medicament p) {
		return produitRepository.save(p);// save(..) ==> if he found r=the id it will update it else it will add a new product
		
		
	}

	@Override
	public void deleteProduit(Medicament p) {
		produitRepository.delete(p);

	}

	@Override
	public Medicament getProduit(Long id) {
		return  produitRepository.findById(id).orElse(null);
	
	}

	@Override
	public List<Medicament> getAllProduits() {
		List<Medicament> prods = produitRepository.findAll();
		return prods;
	}

}
