package fr.formation.sodibank.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import fr.formation.sodibank.entities.*;
import fr.formation.sodibank.repositories.IFundingJpaRepository;
import fr.formation.sodibank.services.IFundingsService;

/**
 * @author Administrateur
 */
@Controller
@RequestMapping("/financement")
public class FundingsController {
    //

    private final IFundingsService fundingsService;

    private final IFundingJpaRepository fundingsJpaRepository;

    @Autowired
    protected FundingsController(IFundingsService fundingsService,
	    IFundingJpaRepository fundingsJpaRepository) {
	this.fundingsService = fundingsService;
	this.fundingsJpaRepository = fundingsJpaRepository;
    }

    // *********************************************************************
    @SuppressWarnings("unused")
    @GetMapping("/toCreate")
    public String toCreate(@ModelAttribute("Fundings") Fundings fundings,
	    Model model) {
	return "welcome";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("Fundings") Fundings fundings,
	    BindingResult result, Model model) {
	if (validateAndSave(fundings, result)) {
	    model.addAttribute("Fundings", new Fundings());
	}
	return "welcome";
    }

    /// **************************Lister les/// fundings*******
    @GetMapping("/ListFundings")
    public String ListFundings(@RequestParam("id") Long id, Model model) {
	List<Fundings> fundings = fundingsService.findFundingsByUserId(id);
	model.addAttribute("Fundings", fundings);
	return "welcome";
    }

    // ***************************************************************************
    private boolean validateAndSave(Fundings fundings, BindingResult result) {
	validate(fundings, result);
	if (!result.hasErrors()) {
	    fundingsService.save(fundings);
	    return true;
	}
	return false;
    }

    private void validate(Fundings fundings, BindingResult result) {
	Devise currency = fundings.getCurrency();
	if (Long.valueOf(0L).equals(currency.getId())) {
	    result.rejectValue("type.id", "error.commons.required");
	}
	if (!fundingsService.validateReference(fundings)) {
	    result.rejectValue("code", "error.entities.Fundings.duplicateCode");
	}
    }
    // ************************************************************************************
    // private void ListFundings(Model model, Fundings fun) {
    // Long id = fun.getId();
    // List<Fundings> fundings = fundingsService.findFundingsByUserId(id);
    // model.addAttribute("Fundings", fundings);
    // }
}