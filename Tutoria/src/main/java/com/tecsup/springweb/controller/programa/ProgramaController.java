package com.tecsup.springweb.controller.programa;

import com.tecsup.springweb.model.Programa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("programa")
public class ProgramaController {

	@Autowired
	ProgramaService service;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		List<Programa> programas = service.allPrograma();
		model.addAttribute("programas", programas);
		return "programa/index";
	}

	@RequestMapping("nuevo")
	public String nuevo(Model model) {
		model.addAttribute("programa", new Programa());
		return "programa/formulario";
	}

	@RequestMapping("{id}/editar")
	public String editar(@PathVariable("id") Long id, Model model) {
		Programa programa = service.findPrograma(id);
		if (programa == null) {
			return "redirect:/programa";
		}
		model.addAttribute("programa", programa);
		return "programa/formulario";
	}

	@RequestMapping("guardar")
	public String guardar(Programa programa) {
		service.guardarPrograma(programa);
		return "redirect:/programa";
	}

	@RequestMapping("{id}/eliminar")
	public String eliminar(@PathVariable("id") Long id) {
		service.deletePrograma(id);
		return "redirect:/programa";
	}

}
