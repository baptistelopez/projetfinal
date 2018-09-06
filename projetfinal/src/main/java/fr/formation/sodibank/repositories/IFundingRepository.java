package fr.formation.sodibank.repositories;

import java.util.List;

import fr.formation.AppLanguage;
import fr.formation.sodibank.dto.fundingsDTO;

public interface IFundingRepository {

    public List<fundingsDTO> findAllAsDTO(AppLanguage lang);
    //
}
