package fr.formation.sodibank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.sodibank.entities.Client;
import fr.formation.sodibank.repositories.*;

@Service
public class BankerService implements IBankerService {

    private final IBankerRepository bankerRepository;

    private final IBankerJpaRepository BankerJpaRepository;

    @Autowired
    protected BankerService(IBankerRepository bankerRepository,
	    IBankerJpaRepository BankerJpaRepository) {
	this.bankerRepository = bankerRepository;
	this.BankerJpaRepository = BankerJpaRepository;
    }

    @Override
    public List<Client> findClientByBankerInterserial() {
	return bankerRepository.findClientByBankerInterserial();
    }
}
