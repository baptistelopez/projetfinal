package fr.formation.sodibank.services;

import org.springframework.beans.factory.annotation.Autowired;

import fr.formation.sodibank.repositories.IFundingRepository;

public class FundingTypeService implements IFundingTypeService {

    private final IFundingRepository fundingTypeRepository;

    @Autowired
    protected FundingTypeService(IFundingRepository fundingTypeRepository) {
	this.fundingTypeRepository = fundingTypeRepository;
    }
}
