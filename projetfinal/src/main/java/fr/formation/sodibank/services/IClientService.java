/**
 *
 */
package fr.formation.sodibank.services;

import java.util.List;

import fr.formation.sodibank.entities.Client;

/**
 * @author Administrateur
 */
public interface IClientService {

    public Client findById(Long id);

    public void save(Client client);

    public boolean validateCode(Client client);

    /**
     * @return
     */
    public List<Client> findAll();
}
