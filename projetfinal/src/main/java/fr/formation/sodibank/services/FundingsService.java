package fr.formation.sodibank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.sodibank.entities.Fundings;
import fr.formation.sodibank.repositories.*;

/**
 * @author Administrateur
 */
@Service
public class FundingsService implements IFundingsService {

    private final IFundingRepository fundingsRepository;

    private final IFundingJpaRepository fundingsJpaRepository;

    @Autowired
    protected FundingsService(IFundingRepository fundingsRepository,
	    IFundingJpaRepository fundingsJpaRepository) {
	this.fundingsRepository = fundingsRepository;
	this.fundingsJpaRepository = fundingsJpaRepository;
    }

    /**
     * @param fundings
     */
    @Override
    public void save(Fundings fundings) {
	fundingsJpaRepository.save(fundings);
    }

    @Override
    public boolean validateReference(Fundings fundings) {
	Long id = fundings.getId();
	String reference = fundings.getReference();
	if (null == id) { // create
	    return !fundingsJpaRepository
		    .existsByReferenceIgnoreCase(reference);
	}
	return !fundingsJpaRepository
		.existsByReferenceIgnoreCaseAndIdNot(reference, id); // update
    }

    // ****************************************************************
    // lister les financements des clients
    @Override
    public List<Fundings> findFundingsByUserId(Long id) {
	return fundingsRepository.findFundingsByUserId(id);
    }
}
