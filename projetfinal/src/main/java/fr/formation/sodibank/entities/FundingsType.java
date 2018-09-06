package fr.formation.sodibank.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author Frank MARSHALL
 */
@Entity
public class FundingsType implements Serializable {

    private static final long serialVersionUID = -3416208634504083069L;

    public static final String SIMPLE = "Simple";

    public static final String SYNDICATED = "Syndicated";

    public static final String REVOLVING = "Revolving";

    public static final String EVOLVE = "Evolve";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public FundingsType() {
	//
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (id == null ? 0 : id.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (!(obj instanceof FundingsType)) {
	    return false;
	}
	FundingsType other = (FundingsType) obj;
	if (id == null) {
	    if (other.id != null) {
		return false;
	    }
	} else if (!id.equals(other.id)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "FundingsType [id=" + id + "]";
    }
}
