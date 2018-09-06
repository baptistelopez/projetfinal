/**
 *
 */
package fr.formation.sodibank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.sodibank.services.*;

/**
 * @author Administrateur
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    private final IFundingsService fundingsService;

    @Autowired
    protected ClientController(IClientService clientService,
	    IFundingsService fundingsService) {
	this.clientService = clientService;
	this.fundingsService = fundingsService;
    }
}