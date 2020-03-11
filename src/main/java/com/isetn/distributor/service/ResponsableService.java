package com.isetn.distributor.service;

import java.util.List;

import com.isetn.distributor.entities.Medicament;
import com.isetn.distributor.entities.Responsable;

public interface ResponsableService {

	
	 Medicament saveResponsable(Responsable c);
	 Medicament updateResponsable(Responsable c);
	 void deleteCResponsable(Responsable c);
	 Medicament getResponsable(Responsable id);
	 List<Responsable> getAllResponsables();
}
