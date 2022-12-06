package tn.enis.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tn.enis.demo.dao.EnseignantChercheurRepository;
import tn.enis.demo.dao.EtudiantRepository;
import tn.enis.demo.entities.EnseignantChercheur;
import tn.enis.demo.entities.Etudiant;
import tn.enis.demo.entities.Member;
import tn.enis.demo.services.IMemberService;

@SpringBootApplication
@EnableDiscoveryClient
public class MemberApplication implements CommandLineRunner{
	@Autowired
	EtudiantRepository etudiantrepo ;
	@Autowired
	EnseignantChercheurRepository enseignantrepo ;
	
	@Autowired
	IMemberService memberService;

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(MemberApplication.class, args);
		
	}



	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat  dateFormatter = new SimpleDateFormat("yyyy-mm-dd");
		
		Date date1 = dateFormatter.parse("2022-05-01");
		Date date2 = dateFormatter.parse("2022-06-01");
		Date date3 = dateFormatter.parse("2022-07-01");

	
	
	Etudiant fatma = new Etudiant("11127749","khlif","fatma",date1,null,"fatma@gmail.com","cv1","pass1",date2,"");
	Etudiant emna = new Etudiant("11127748","khlif","fatma",date1,null,"fatma@gmail.com","cv1","pass1",date2,"");

	EnseignantChercheur en1 = new EnseignantChercheur("11127747","khlif","emna",date1,null,"","fafa","email","chercheur","doctorant");
	 etudiantrepo.save(fatma);
	 etudiantrepo.save(emna);
	 enseignantrepo.save(en1);
	 
	// Update a Member
	 Member m= memberService.findMember(1L);
	 m.setCv("cv1.pdf");
	 memberService.updateMember(m);
	 // Delete a Member
	 memberService.deleteMember(2L);
	}}
