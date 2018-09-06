package fr.formation.sodibank.services;

import java.util.*;

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

    private final IFundingsService fundingsService;

    private final IFundingJpaRepository fundingJpaRepository;

    @Autowired
    protected FundingsService(IFundingsService fundingsService,
	    IFundingJpaRepository fundingJpaRepository) {
	this.fundingsService = fundingsService;
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

    @Override
    public boolean validateRef(Fundings fundings) {
	Long id = fundings.getId();
	String ref = fundings.getRef();
	if (null == id) { // create
	    return !fundingJpaRepository.existsByRefIgnoreCase(ref);
	}
	return !fundingJpaRepository.existsByRefIgnoreCaseAndIdNot(ref, id); // update
    }

    /**
     * @return
     */
    @Override
    public List<Fundings> findAll() {
	return fundingJpaRepository.findAll();
    }
}
