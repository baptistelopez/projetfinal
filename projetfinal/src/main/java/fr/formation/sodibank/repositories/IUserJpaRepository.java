package fr.formation.sodibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface IUserJpaRepository extends JpaRepository<User, Long> {

    public User findByEmail(String username);

    public boolean existsByEmailIgnoreCase(String email);

    public boolean existsByEmailIgnoreCaseAndIdNot(String email, Long id);
}
