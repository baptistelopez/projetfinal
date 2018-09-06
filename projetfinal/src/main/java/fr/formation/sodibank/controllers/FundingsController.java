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

    private final IFundingJpaRepository fundingJpaRepository;

    private final IFundingsService fundingsService;

    @Autowired
    protected FundingsController(IFundingsService fundingsService,
	    IFundingJpaRepository fundingJpaRepository) {
	this.fundingsService = fundingsService;
	this.fundingJpaRepository = fundingJpaRepository;
    }

    // ********************************************
    @SuppressWarnings("unused")
    @GetMapping("/toCreate")
    public String toCreate(@ModelAttribute("funding") Fundings funding,
	    Model model) {
	populateModel(model);
	return "fundingCreate"; // créer la jsp fundingCreate ;
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("course") Fundings funding,
	    BindingResult result, Model model) {
	if (validateAndSave(funding, result)) {
	    model.addAttribute("course", new Fundings());
	}
	populateModel(model);
	return "fundingCreate";
    }

    @GetMapping("/toUpdate")
    public String toUpdate(@RequestParam("id") Long id, Model model) {
	Fundings funding = fundingsService.findById(id);
	model.addAttribute("Funding", funding);
	populateModel(model);
	return "fundingUpdate"; // créer la jsp fundingUpdate ;
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("funding") Fundings funding,
	    BindingResult result, Model model) {
	if (validateAndSave(funding, result)) {
	    return "redirect:/home/welcome";
	}
	populateModel(model);
	return "fundingsUpdate";
    }

    @GetMapping("/list")
    public String fundingsListe(Model model) {
	List<Fundings> fundings = fundingJpaRepository.findAll();
	model.addAttribute("Fundings", fundings);
	return "listFundings"; // créer la jsp listFundings ;
    }

    // ***********************validation*************************
    private boolean validateAndSave(Fundings fundings, BindingResult result) {
	validate(fundings, result);
	if (!result.hasErrors()) {
	    fundingsService.save(fundings);
	    return true;
	}
	return false;
    }

    private void validate(Fundings fundings, BindingResult result) {
	FundingsType fundingType = fundings.getFundingsType();
	if (Long.valueOf(0L).equals(fundingType.getId())) {
	    result.rejectValue("fundingType.id", "error.commons.required");
	}
	if (!fundingsService.validateRef(fundings)) {
	    result.rejectValue("ref", "error.entities.course.duplicateRef");
	}
    }

    // ********************methode populate*****************************
    private void populateModel(Model model) {
	List<Fundings> fundings = fundingsService.findAll();
	model.addAttribute("Fundings", fundings);
    }
}