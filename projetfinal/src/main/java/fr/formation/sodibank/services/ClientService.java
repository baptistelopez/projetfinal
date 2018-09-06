/**
 *
 */
package fr.formation.sodibank.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import fr.formation.sodibank.entities.Client;
import fr.formation.sodibank.repositories.IClientJpaRepository;

/**
 * @author Administrateur
 */
@Service
public class ClientService implements IClientService {

    private final IClientJpaRepository clientJpaRepository;

    private final IClientService clientService;

    @Autowired
    protected ClientService(IClientJpaRepository clientJpaRepository,
	    IClientService clientService) {
	this.clientJpaRepository = clientJpaRepository;
	this.clientService = clientService;
    }

    @Override
    public Client findById(Long id) {
	Optional<Client> optional = clientJpaRepository.findById(id);
	return optional.get();
    }

    @Override
    public void save(Client client) {
	clientJpaRepository.save(client);
    }

    @Override
    public boolean validateCode(Client client) {
	Long id = client.getId();
	String code = client.getCode();
	return !clientJpaRepository.existsByCodeIgnoreCaseAndIdNot(code, id); // update
    }

    // ********************methode populate*****************************
    private void populateModel(Model model) {
	List<Client> clients = clientService.findAll();
	model.addAttribute("Client", clients);
    }

    @Override
    public List<Client> findAll() {
	return clientJpaRepository.findAll();
    }
}
