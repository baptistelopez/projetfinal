package fr.formation.sodibank.services;

import fr.formation.sodibank.entities.User;

public interface IUserService {

    public void save(User user);

    public boolean validateEmail(User user);

    public User findById(Long id);
}
