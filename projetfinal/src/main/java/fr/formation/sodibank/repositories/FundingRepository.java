package fr.formation.sodibank.repositories;

import java.util.List;

import javax.persistence.Query;

import fr.formation.AppLanguage;
import fr.formation.sodibank.dto.fundingsDTO;

public class FundingRepository extends BaseRepository
	implements IFundingRepository {

    @SuppressWarnings("unchecked")
    @Override
    public List<fundingsDTO> findAllAsDTO(AppLanguage lang) {
	StringBuilder queryBuilder = new StringBuilder(
		"select new fr.formation.sodibank.dto.fundingsDTO(f.id, f.reference, f.amount, f.currency, f.duration, f.fundingDateWished, "
			+ "f.fundingsType, f.requestDate, f.fundingPerformance");
	String nameCol = "frenchName";
	if (lang.isEnglish()) {
	    nameCol = "englishName";
	}
	queryBuilder.append(nameCol);
	queryBuilder.append("as fundingsName)from Fundings f ");
	Query query = em.createQuery(queryBuilder.toString());
	return query.getResultList();
    }
}
