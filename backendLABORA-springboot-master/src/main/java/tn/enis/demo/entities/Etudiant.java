package tn.enis.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date ;


@Entity @DiscriminatorValue("etd")
public class Etudiant extends Member implements Serializable {
	private Date dateInscription ;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Etudiant(String cin, String nom, String prenom, java.util.Date date, byte[] photo, String email,String cv,
			String password, java.util.Date dateInscription, String diplome) {
		super(cin, nom, prenom, date, photo, email,cv, password);
		this.dateInscription = dateInscription;
		diplome = diplome;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		diplome = diplome;
	}
	private String diplome ;
	@ManyToOne
	private EnseignantChercheur encadrant;
	

}
