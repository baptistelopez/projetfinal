package fr.formation.sodibank.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.sodibank.entities.Fundings;
import fr.formation.sodibank.repositories.IFundingJpaRepository;

/**
 * @author Administrateur
 */
@Service
public class FundingsService implements IFundingsService {
    //

    private final IFundingsService fundingRepository;

    private final IFundingJpaRepository fundingJpaRepository;

    @Autowired
    protected FundingsService(IFundingsService fundingRepository,
	    IFundingJpaRepository fundingJpaRepository) {
	this.fundingRepository = fundingRepository;
	this.fundingJpaRepository = fundingJpaRepository;
    }

    @Override
    public Fundings findById(Long id) {
	Optional<Fundings> optional = fundingJpaRepository.findById(id);
	return optional.get();
    }

    @Override
    public void save(Fundings fundings) {
	fundingJpaRepository.save(fundings);
    }
}
