package com.isetn.distributor.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity  
public class Responsable implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long idResponsable;
	private String nom;
	private String prenom;
	private String specialite;
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responsable(Long idResponsable, String nom, String prenom, String specialite) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
	}
	public Long getIdResponsable() {
		return idResponsable;
	}
	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return "Responsable [idResponsable=" + idResponsable + ", nom=" + nom + ", prenom=" + prenom + ", specialite="
				+ specialite + "]";
	}
	
	

}
