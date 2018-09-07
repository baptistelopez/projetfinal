package fr.formation.sodibank.services;

import java.util.List;

import fr.formation.sodibank.entities.Fundings;

/**
 * @author Administrateur
 */
public interface IFundingsService {

    public void save(Fundings fundings);
    //
    // public Fundings findById(Long id);
    //
    // public boolean validateRef(Fundings fundings);
    //
    // public List<Fundings> findAll();

    public boolean validateReference(Fundings fundings);

    public List<Fundings> findFundingsByUserId(Long id);
}
