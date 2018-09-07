package fr.formation.sodibank.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.sodibank.entities.Fundings;

/**
 * @author Administrateur
 */
@Service
public class FundingsService implements IFundingsService {

    /**
     * @param fundings
     */
    @Override
    public void save(Fundings fundings) {
	throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Fundings findById(Long id) {
	throw new UnsupportedOperationException("not yet implemented");
    }
    //
    /*
     * // private final IFundingsService fundingRepository; private final
     * IFundingJpaRepository fundingJpaRepository;
     * @Autowired protected FundingsService(IFundingsService fundingRepository,
     * IFundingJpaRepository fundingJpaRepository) { // this.fundingRepository =
     * fundingRepository; this.fundingJpaRepository = fundingJpaRepository; }
     * @Override public Fundings findById(Long id) { Optional<Fundings> optional
     * = fundingJpaRepository.findById(id); return optional.get(); }
     * @Override public void save(Fundings fundings) {
     * fundingJpaRepository.save(fundings); }
     */

    @Override
    public boolean validateRef(Fundings fundings) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public List<Fundings> findAll() {
	// TODO Auto-generated method stub
	return null;
    }
}
