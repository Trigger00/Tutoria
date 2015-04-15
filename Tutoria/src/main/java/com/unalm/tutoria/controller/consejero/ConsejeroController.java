package com.unalm.tutoria.controller.consejero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unalm.tutoria.model.ConsejeriaEntity;

@Controller
@RequestMapping("consejero")
public class ConsejeroController {

	@Autowired
	ConsejeroService service;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<ConsejeriaEntity> consejeros = service.allConsejero();
		model.addAttribute("consejeros", consejeros);
		return "consejero/index";

	}
}
