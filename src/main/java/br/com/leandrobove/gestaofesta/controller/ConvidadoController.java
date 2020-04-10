package br.com.leandrobove.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.leandrobove.gestaofesta.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {
	
	@Autowired
	private ConvidadoRepository convidado;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listaConvidados");
		
		modelAndView.addObject("convidados", convidado.findAll());
		
		return modelAndView;
	}

}
