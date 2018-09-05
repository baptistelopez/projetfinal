package fr.formation.sodibank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController extends BaseController{

	@GetMapping("/admin")
	public String admin(Model model) {
		return "pageAccueil";
	}
}