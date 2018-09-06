/**
 *
 */
package fr.formation.sodibank.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.sodibank.entities.Client;
import fr.formation.sodibank.repositories.IClientJpaRepository;

/**
 * @author Administrateur
 */
@Service
public class ClientService implements IClientService {

    private final IClientJpaRepository clientJpaRepository;

    @Autowired
    protected ClientService(IClientJpaRepository clientJpaRepository) {
	this.clientJpaRepository = clientJpaRepository;
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
}
