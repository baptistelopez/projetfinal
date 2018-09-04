package fr.formation.sodibank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import fr.formation.Principal;
import fr.formation.sodibank.repositories.IUserJpaRepository;

@Service
public class LoginService implements ILoginService {

    private final IUserJpaRepository userJpaRepo;

    @Autowired
    protected LoginService(IUserJpaRepository userJpaRepo) {
	this.userJpaRepo = userJpaRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
	User user = userJpaRepo.findByEmail(username);
	if (null == user) {
	    throw new UsernameNotFoundException(
		    "No user found with username: " + username);
	}
	return new Principal(user);
    }
}
