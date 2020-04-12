package br.com.leandrobove.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.leandrobove.gestaofesta.model.Convidado;
import br.com.leandrobove.gestaofesta.service.ConvidadoService;

@Controller
@RequestMapping("/convidados")
public class ConvidadoController {

	@Autowired
	private ConvidadoService convidadoService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listaConvidados");

		modelAndView.addObject("convidados", convidadoService.listar());

		return modelAndView;
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public ModelAndView abrirFormCadastro() {

		ModelAndView modelAndView = new ModelAndView("cadastrarConvidado");

		modelAndView.addObject(new Convidado());

		return modelAndView;
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public String cadastrar(@ModelAttribute Convidado c, RedirectAttributes atts) {

		convidadoService.salvar(c);

		atts.addFlashAttribute("msg", "Cadastrado com sucesso.");

		return "redirect:/convidados";
	}

	@RequestMapping(value = "/deletar", method = RequestMethod.POST)
	public String deletar(Long id, RedirectAttributes atts) {

		convidadoService.deletar(id);

		atts.addFlashAttribute("msg", "Convidado deletado com sucesso.");

		return "redirect:/convidados";
	}

	@RequestMapping(value = "/buscarPorId", method = RequestMethod.GET)
	public ModelAndView buscarPorIdNome(Long id) {
		ModelAndView modelAndView = new ModelAndView("listaConvidados");

		modelAndView.addObject("convidados", convidadoService.buscarPorId(id));

		return modelAndView;
	}

}
