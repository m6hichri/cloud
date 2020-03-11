package com.isetn.distributor.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity  
public class Client implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long idClient;
	private String nom;
	private String prenom;
	private Integer age;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long idClient, String nom, String prenom, Integer age) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
	
	
}
