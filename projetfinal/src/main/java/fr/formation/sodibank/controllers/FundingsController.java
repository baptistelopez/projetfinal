package fr.formation.sodibank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.sodibank.services.*;

/**
 * @author Administrateur
 */
@Controller
@RequestMapping("/financement")
public class FundingsController {
    //

    private final IFundingsService fundingsService;

    private final IFundingTypeService fundingTypeService;

    @Autowired
    protected FundingsController(IFundingsService fundingsService,
	    IFundingTypeService fundingTypeService) {
	this.fundingsService = fundingsService;
	this.fundingTypeService = fundingTypeService;
    }
}