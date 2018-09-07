/**
 *
 */
package fr.formation.sodibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.sodibank.entities.Client;

/**
 * @author Administrateur
 */
public interface IClientJpaRepository extends JpaRepository<Client, Long> {
    //
}
