package com.bolsadeideas.sprintboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.sprintboot.di.app.models.service.IServicio;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("miServicioSimple")
	private IServicio servicio;
	
	/*
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/
	/*@Autowired
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
	/*@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	

}
