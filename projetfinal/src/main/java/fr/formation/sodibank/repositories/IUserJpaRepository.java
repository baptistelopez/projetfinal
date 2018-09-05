package fr.formation.sodibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.sodibank.entities.User;

public interface IUserJpaRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);

    public boolean existsByUsernameIgnoreCase(String username);

    public boolean existsByUsernameIgnoreCaseAndIdNot(String username, Long id);
    //
    
}
