package fr.formation.sodibank.repositories;

import java.util.List;

import fr.formation.sodibank.entities.Fundings;

public interface IFundingRepository {

    public List<Fundings> findFundingsByUserId(Long id);
}
