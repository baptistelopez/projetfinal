package fr.formation.sodibank.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.Client;

import fr.formation.AppLanguage;

@Service
public class BankerService implements IBankerService {

    @Override
    public Client findById(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Client> findAllAsDTO(AppLanguage lang) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteById(Long id) {
	// TODO Auto-generated method stub
    }
}
