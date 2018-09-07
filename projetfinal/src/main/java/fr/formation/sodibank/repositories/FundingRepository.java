package fr.formation.sodibank.repositories;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.formation.sodibank.entities.Fundings;

@Repository
public class FundingRepository extends BaseRepository
	implements IFundingRepository {

    @SuppressWarnings("unchecked")
    @Override
    public List<Fundings> findFundingsByUserId(Long id) {
	StringBuilder jpql = new StringBuilder(
		"select f from User u join u.clients c join");
	jpql.append("Fundings f on f.customerCode.id = c.id");
	jpql.append("where u.id = :id order by requestDate");
	Query query = em.createQuery(jpql.toString());
	query.setParameter("id", id);
	return query.getResultList();
    }
}
