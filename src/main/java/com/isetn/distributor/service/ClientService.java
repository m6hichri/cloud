package com.isetn.distributor.service;

import java.util.List;

import com.isetn.distributor.entities.Client;
import com.isetn.distributor.entities.Medicament;



public interface ClientService {
	
	 Medicament saveClient(Client c);
	 Medicament updateClient(Client c);
	 void deleteClient(Client c);
	 Medicament getClient(Long id);
	 List<Client> getAllClients();

}
