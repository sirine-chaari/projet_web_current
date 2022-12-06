package tn.enis.demo.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;


import java.util.Date ;


@Entity @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType =
DiscriminatorType.STRING,length = 3)
public abstract class Member implements Serializable {
	
	
	
	public Member(String cin, String nom, String prenom, Date date, byte[] photo, String email, String cv,
			String password) {
		super();
	
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.photo = photo;
		this.email = email;
		this.cv = cv;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String cin ;
	private String nom ;
	private String prenom ;
	private Date date ;
	private byte[] photo ; 
	private String email;
	private String cv ;
	private String password ;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		prenom = prenom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		date = date;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		photo = photo;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		cv = cv;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
