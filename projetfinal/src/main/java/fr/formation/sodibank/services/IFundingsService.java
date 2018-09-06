package fr.formation.sodibank.services;

import fr.formation.sodibank.entities.Fundings;

/**
 * @author Administrateur
 */
public interface IFundingsService {

    public void save(Fundings fundings);
    //

    public Fundings findById(Long id);
}
