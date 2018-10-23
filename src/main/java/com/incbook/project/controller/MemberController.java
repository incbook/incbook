package com.incbook.project.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.incbook.project.domain.MemberVO;
import com.incbook.project.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Inject
	private MemberService service;

	@RequestMapping(value = "/loginform", method = RequestMethod.POST)
	public String checkIdPassword(MemberVO vo, Model model) throws Exception {
		MemberVO var = service.checkIdPassword(vo);
		
		model.addAttribute("id",var);
		
		
		return "member/login";
	}
	
	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public void checkIdPassword() throws Exception {

	
	}
	
	@RequestMapping(value = "/checkIdPassword", method = RequestMethod.GET)
	public void checked() throws Exception {
	
	}
	
	/**
	 * 회원가입 폼
	 */
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public void signUpGET() throws Exception {
		
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public void signUpPOST(MemberVO vo) throws Exception {
		System.out.println(vo);
	}
	
}
