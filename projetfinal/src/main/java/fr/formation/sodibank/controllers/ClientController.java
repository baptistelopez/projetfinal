/**
 *
 */
package fr.formation.sodibank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.sodibank.services.IClientService;

/**
 * @author Administrateur
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @Autowired
    protected ClientController(IClientService clientService) {
	this.clientService = clientService;
    }
}