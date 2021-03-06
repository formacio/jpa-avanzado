package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MiController {
	
	@Autowired
	private MiService miService;

	@RequestMapping(path="/crea")
	@ResponseBody
	public Persona crea (String nombre, String municipio) {
		return miService.crea(nombre, municipio);
	}
	
	@RequestMapping(path="/consulta")
	@ResponseBody
	public String consulta (String nombre) {
		Persona persona = miService.consulta(nombre);
		System.out.println("accedemos a municipio");
		return persona.getMunicipio();
	}
	
}
