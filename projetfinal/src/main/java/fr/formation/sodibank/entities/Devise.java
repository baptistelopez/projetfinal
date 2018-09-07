/**
 *
 */
package fr.formation.sodibank.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Administrateur
 */
@Entity
public class Devise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "{error.commons.required}")
    private String codeIso;

    public Devise() {
	//
    }

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
	this.id = id;
    }

    /**
     * @return the codeIso
     */
    public String getCodeIso() {
	return codeIso;
    }

    /**
     * @param codeIso
     *            the codeIso to set
     */
    public void setCodeIso(String codeIso) {
	this.codeIso = codeIso;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (codeIso == null ? 0 : codeIso.hashCode());
	result = prime * result + (id == null ? 0 : id.hashCode());
	return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Devise other = (Devise) obj;
	if (codeIso == null) {
	    if (other.codeIso != null) {
		return false;
	    }
	} else if (!codeIso.equals(other.codeIso)) {
	    return false;
	}
	if (id == null) {
	    if (other.id != null) {
		return false;
	    }
	} else if (!id.equals(other.id)) {
	    return false;
	}
	return true;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Devise [id=" + id + ", codeIso=" + codeIso + "]";
    }
}
