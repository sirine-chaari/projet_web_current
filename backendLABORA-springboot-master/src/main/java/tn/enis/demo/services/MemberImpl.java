package tn.enis.demo.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enis.demo.dao.EnseignantChercheurRepository;
import tn.enis.demo.dao.EtudiantRepository;
import tn.enis.demo.dao.MemberRepository;
import tn.enis.demo.entities.EnseignantChercheur;
import tn.enis.demo.entities.Etudiant;
import tn.enis.demo.entities.Member;

@Service
public class MemberImpl implements IMemberService {

	@Autowired
	MemberRepository memberRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantChercheurRepository enseignantChercheurRepository;
	public Member addMember(Member m) {
		memberRepository.save(m);
		return m;
	}
	public void deleteMember(Long id) {
		memberRepository.deleteById(id);
	}
	public Member updateMember(Member m) {
	return memberRepository.saveAndFlush(m);
	}
	
	public Member findMember(Long id) {
		Member m= (Member)memberRepository.findById(id).get();
		return m;
	}
	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}
	@Override
	public Member findByCin(String cin) {
		// TODO Auto-generated method stub
		return (Member)memberRepository.findByCin(cin);
	}
	@Override
	public Member findByEmail(String email) {
		// TODO Auto-generated method stub
		return (Member)memberRepository.findByEmail(email);
	}
	@Override
	public List<Member> findByNom(String nom) {
		// TODO Auto-generated method stub
		return (List<Member>) memberRepository.findByNomStartingWith(nom);
	}
	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		// TODO Auto-generated method stub
		return (List<Etudiant>) etudiantRepository.findByDiplome(diplome);
	}
	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		// TODO Auto-generated method stub
		return (List<EnseignantChercheur>) enseignantChercheurRepository.findByGrade(grade);
	}
	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		// TODO Auto-generated method stub
		return (List<EnseignantChercheur>) enseignantChercheurRepository.findByEtablissement(etablissement);
	}
	
}
	
