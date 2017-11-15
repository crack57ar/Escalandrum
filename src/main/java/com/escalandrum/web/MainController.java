package com.escalandrum.web;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.escalandrum.domain.Zona;
import com.escalandrum.service.PersistDataService;

@Controller
public class MainController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersistDataService service;

	
	@RequestMapping(value = "/zonas", method = RequestMethod.GET)
	public String zonas(Map<String, Object> model) {
		logger.debug("obteniendo las zonas...");
		List<Zona> zonas = service.getAll(Zona.class);
		model.put("zonas", zonas);
		return "zonas";
	}
	
	@RequestMapping(value = "/zona/{name:.+}", method = RequestMethod.GET)
	public String zonaPorNombre(Map<String, Object> model, String name) {
		logger.debug("obteniendo la zona {}", name);
		Zona zona = service.getByName(name, Zona.class);
		model.put("zona",zona);
		return "zona";
	}
	
	@RequestMapping(value = "/zona/insertar", method = RequestMethod.GET)
	public ModelAndView insertarZona() {
		ModelAndView mv = new ModelAndView("zona", "zona", new Zona());
		return mv;
	}
	
	@RequestMapping(value = "/zona/insertar", method = RequestMethod.POST)
	public String insertarZona(@ModelAttribute Zona zona, 	
			   ModelMap model) {
			
			model.addAttribute("nombre", zona.getNombre());
			model.addAttribute("descripcion", zona.getDescripcion());
			model.addAttribute("ubicacion", zona.ubicacion);
		return "zonaSubmit";
	}
	
}
