package com.isetn.distributor.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


@Entity  
public class Medicament implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long idMedicament;
	private String nomMedicament;
	private Integer quantite;
	private Integer dose;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
	@Column(name = "heurePrise")
	//private String heurePrise;
	private ArrayList<String> heurePrise;
	
	
	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicament(Long idMedicament, String nomMedicament, Integer quantite, Integer dose,
			ArrayList<String>  heurePrise) {
		super();
		this.idMedicament = idMedicament;
		this.nomMedicament = nomMedicament;
		this.quantite = quantite;
		this.dose = dose;
		this.heurePrise = heurePrise;
	}
	public Long getIdMedicament() {
		return idMedicament;
	}
	public void setIdMedicament(Long idMedicament) {
		this.idMedicament = idMedicament;
	}
	


	public String getNomMedicament() {
		return nomMedicament;
	}
	public void setNomMedicament(String nomMedicament) {
		this.nomMedicament = nomMedicament;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Integer getDose() {
		return dose;
	}
	public void setDose(Integer dose) {
		this.dose = dose;
	}
	public ArrayList<String>  getHeurePrise() {
		return heurePrise;
	}
	public void setHeurePrise(ArrayList<String>  heurePrise) {
		this.heurePrise = heurePrise;
	}
	@Override
	public String toString() {
		return "Medicament [idMedicament=" + idMedicament + ", nomMedicament=" + nomMedicament + ", quantite="
				+ quantite + ", dose=" + dose + ", heurePrise=" + heurePrise + "]";
	}
	
	

	/**
	 * 
	 * Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);


java.util.Date date = new java.util.Date();
	 */
}
