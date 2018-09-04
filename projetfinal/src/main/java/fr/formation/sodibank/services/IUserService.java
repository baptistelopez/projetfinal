package fr.formation.sodibank.services;

import org.springframework.security.core.userdetails.User;

public interface IUserService {

    public void save(User user);

    public boolean validateEmail(User user);

    public User findById(Long id);
}
