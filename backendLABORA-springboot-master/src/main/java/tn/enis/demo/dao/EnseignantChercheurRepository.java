package tn.enis.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enis.demo.entities.EnseignantChercheur;
@Repository 
public interface EnseignantChercheurRepository extends JpaRepository<EnseignantChercheur, Long> {
	
	List<EnseignantChercheur>findByGrade(String grade);
	List<EnseignantChercheur>findByEtablissement(String etablissement);

}
