package fr.formation.sodibank.services;

import org.springframework.security.core.userdetails.*;

public interface ILoginService extends UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username);
}
