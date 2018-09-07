package fr.formation;

import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ImportResource("classpath:*-context.xml")
@ComponentScan(basePackages = { "fr.formation.sodibank.repositories",
	"fr.formation.sodibank.services", "fr.formation.sodibank.dto" })
@EnableJpaRepositories("fr.formation.sodibank.repositories")
@EnableTransactionManagement
public class AppConfig {
    // Empty clas
}
