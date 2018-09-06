package fr.formation.sodibank.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Frank MARSHALL
 */
@Entity
public class BankerPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    @NotNull(message = "{error.commons.required}")
    private String internSerial;

    @Column(length = 10, nullable = false)
    @NotNull(message = "{error.commons.required}")
    private String customerCode;
}
