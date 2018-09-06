package fr.formation.sodibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.sodibank.entities.Fundings;

public interface IFundingJpaRepository extends JpaRepository<Fundings, Long> {

    public boolean existsByRefIgnoreCase(String ref);
    //

    public boolean existsByRefIgnoreCaseAndIdNot(String ref, Long id);
}
