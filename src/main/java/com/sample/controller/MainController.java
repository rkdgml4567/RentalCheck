package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sample.domain.InvestigateVO;
import com.sample.service.InvestigateService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/main/*")
@Controller
@Log4j
@AllArgsConstructor
public class MainController {
	
	private InvestigateService service;
	
	@GetMapping("/investigate")
	public void investigate() {
	
	}
	
	
	@GetMapping("/result")
	public void result(InvestigateVO vo,Model model) {
		System.out.println(vo);
		
		model.addAttribute("result",service.result(vo));
		
	}
}
