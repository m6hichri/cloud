package com.isetn.distributor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isetn.distributor.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
