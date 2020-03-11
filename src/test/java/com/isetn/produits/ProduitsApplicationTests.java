package com.isetn.produits;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.isetn.distributor.entities.Medicament;
import com.isetn.distributor.repos.MedicamentRepository;

@SpringBootTest
class ProduitsApplicationTests {

	// @Autowired : injection of dependences when told to spring to inject in the object: produitRepository
	//a implementation of the interface MedicamentRepository
	//spring will instantiate a class which implement MedicamentRepository interface after it will inject
	//in this object produitRepository
	//@Autowired 
	private MedicamentRepository produitRepository;
	//@Test is a annotation for tests 
	
	
	//@Test
	

	/*
	 * 
	 * 	public String testUpdateProduit()
	 {
		Medicament p = produitRepository.findById(1L).orElse(null);
		p.setPrixProduit(5000.0);
		 produitRepository.save(p);
		
	 }
	
	@Test
	 public void testCreateProduit() {
		Medicament prod = new Medicament();
		prod.setNomProduit("PC Asus");
		prod.setPrixProduit(100.0);
		produitRepository.save(prod);// save prod ==> product, this method will make an  insert in the table product
	}*/
	/*
	@Test
	public void testFindProduit()
	 {// L ==> for row , line ...
		 Medicament p = produitRepository.findById(1L).orElse(null);
		 System.out.println("******************************************************" +p);
	 }

	@Test
	public void testUpdateProduit()
	 {
		 Medicament p = produitRepository.findById(1L).orElse(null);
		p.setPrixProduit(5000.0);
		 produitRepository.save(p);
	 }
	
	@Test
	public void testDeleteProduit()
	 {
		 produitRepository.deleteById(1L);;
		 
	 }

	*/
	
}
