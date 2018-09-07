package fr.formation.sodibank.repositories;

import java.util.List;

import javax.persistence.Query;

import fr.formation.sodibank.entities.Client;

public class BankerRepository extends BaseRepository
	implements IBankerRepository {

    // liste des clients dans le portefeuille du banquier
    @Override
    public List<Client> findClientByBankerInterserial() {
	StringBuilder queryBuilder = new StringBuilder(
		"select c.code,c.lastname, c.legalForm, c.accountNumber, c.raiting from BankerPosition b join b.client c where b.internSerial =''");
	Query query = em.createQuery(queryBuilder.toString());
	return query.getResultList();
    }
}
