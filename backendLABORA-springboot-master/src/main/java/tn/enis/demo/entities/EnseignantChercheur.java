package tn.enis.demo.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity @DiscriminatorValue("ens")
public class EnseignantChercheur extends Member {
	private String grade ;
	public String getGrade() {
		return grade;
	}
	public EnseignantChercheur( String cin, String nom, String prenom, java.util.Date date, byte[] photo, String email,
			String cv, String password, String grade, String etablissement) {
		super( cin, nom, prenom, date, photo, email,cv, password);
		this.grade = grade;
		this.etablissement = etablissement;
	}
	public EnseignantChercheur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	private String etablissement ;
	@OneToMany(mappedBy = "encadrant")
	private Collection<Etudiant> etudiants ;

}
