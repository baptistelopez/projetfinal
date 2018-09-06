package fr.formation.sodibank.services;

import java.util.List;

import com.mysql.fabric.xmlrpc.Client;

import fr.formation.AppLanguage;

public interface IBankerService {

    public Client findById(Long id);

    public List<Client> findAllAsDTO(AppLanguage lang);

    public void deleteById(Long id);
}
