package fr.formation.sodibank.repositories;

import java.util.List;

import fr.formation.sodibank.entities.Client;

public interface IBankerRepository {

    public List<Client> findClientByBankerInterserial();
    //
}
