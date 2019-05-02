package com.bme.pfe.reporting.crtl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bme.pfe.reporting.model.Ordinateur;
import com.bme.pfe.reprting.utils.pdf.PDFGenerator;

@Controller
public class OrdinateurController {

	private static List<Ordinateur> ordinateurs;

	// inject via application.properties
	// @Value("${welcome.message}")
	private String message;
	static {
		ordinateurs = new ArrayList<Ordinateur>();
		ordinateurs.add(new Ordinateur("12.0.0.1", "12.0.0.1", "G"));
		ordinateurs.add(new Ordinateur("12.0.0.2", "12.0.0.2", "G"));
		ordinateurs.add(new Ordinateur("12.0.0.3", "12.0.0.3", "G"));
		ordinateurs.add(new Ordinateur("12.0.0.4", "12.0.0.4", "G"));
		ordinateurs.add(new Ordinateur("12.0.0.5", "12.0.0.5", "G"));
		ordinateurs.add(new Ordinateur("12.0.0.6", "12.0.0.6", "G"));
		ordinateurs.add(new Ordinateur("12.0.0.7", "12.0.0.7", "G"));
		ordinateurs.add(new Ordinateur("12.0.0.8", "12.0.0.8", "G"));

	}

	@PostMapping("/export")
	public ModelAndView export(final Model model, final HttpServletRequest request, final HttpServletResponse response) {
		model.addAttribute("message", "let start");
		model.addAttribute("ordinateurs", ordinateurs);

		try {
			System.out.println("test list size " + ordinateurs.size());
			final Map<String, Object> maps = new HashMap<String, Object>();
			maps.put("Ordinateurs", ordinateurs);
			return new ModelAndView(new PDFGenerator(), "Ordinateurs", ordinateurs);

		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return new ModelAndView("error-page", "error-message", "error has been occured");

	}

	@GetMapping("/")
	public String welcome(final Model model) {
		model.addAttribute("message", "let start");
		model.addAttribute("ordinateurs", ordinateurs);
		return "welcome"; // view
	}

}