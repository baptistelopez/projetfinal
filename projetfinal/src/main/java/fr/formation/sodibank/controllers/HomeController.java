package fr.formation.sodibank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {

    @GetMapping("/welcome")
    public String welcome(Model model) {
	return "welcome";
    }
}