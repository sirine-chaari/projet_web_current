package tn.enis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.enis.demo.entities.Member;
import tn.enis.demo.services.IMemberService;

@RestController
public class MemberRestController {
	
	@Autowired
	IMemberService memberService;
	@RequestMapping(value="/membres", method=RequestMethod.GET)
	public List<Member> findMembres (){
		return memberService.findAll();
	}
	@GetMapping(value="/membres/{id}")
	public Member findOneMemberById(@PathVariable Long id){
		return memberService.findMember(id);
	}
	
	@GetMapping(value="/membres/search/cin")
	public Member findOneMemberByCin(@RequestParam String cin)
	{
		return memberService.findByCin(cin);
	}
	@GetMapping(value="/membres/search/email")
	public Member findOneMemberByEmail(@RequestParam String email)
	{
		return memberService.findByEmail(email);
	}
}


