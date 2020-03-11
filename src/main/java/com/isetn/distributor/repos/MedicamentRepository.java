package com.isetn.distributor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isetn.distributor.entities.Medicament;

//manage CRUD
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
	

}
