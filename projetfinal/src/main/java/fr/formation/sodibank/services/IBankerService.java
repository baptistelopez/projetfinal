package fr.formation.sodibank.services;

import java.util.List;

import fr.formation.sodibank.entities.Client;

public interface IBankerService {

    public List<Client> findClientByBankerInterserial();
}
