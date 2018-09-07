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

    // remplacer en collabo
    @OneToOne
    @NotNull(message = "{error.commons.required}")
    @JoinColumn(nullable = false)
    private Collaborator collaborator;

    @ManyToOne
    @JoinColumn(nullable = false)
    @NotNull(message = "{error.commons.required}")
    private Client client;

    public BankerPosition() {
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
     * @return the collaborator
     */
    public Collaborator getCollaborator() {
	return collaborator;
    }

    /**
     * @param collaborator
     *            the collaborator to set
     */
    public void setCollaborator(Collaborator collaborator) {
	this.collaborator = collaborator;
    }

    /**
     * @return the client
     */
    public Client getClient() {
	return client;
    }

    /**
     * @param client
     *            the client to set
     */
    public void setClient(Client client) {
	this.client = client;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (client == null ? 0 : client.hashCode());
	result = prime * result
		+ (collaborator == null ? 0 : collaborator.hashCode());
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
	if (getClass() != obj.getClass()) {
	    return false;
	}
	BankerPosition other = (BankerPosition) obj;
	if (client == null) {
	    if (other.client != null) {
		return false;
	    }
	} else if (!client.equals(other.client)) {
	    return false;
	}
	if (collaborator == null) {
	    if (other.collaborator != null) {
		return false;
	    }
	} else if (!collaborator.equals(other.collaborator)) {
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

    @Override
    public String toString() {
	return "BankerPosition [id=" + id + ", collaborator=" + collaborator
		+ ", client=" + client + ", getId()=" + getId()
		+ ", getCollaborator()=" + getCollaborator() + ", getClient()="
		+ getClient() + ", hashCode()=" + hashCode() + ", getClass()="
		+ getClass() + ", toString()=" + super.toString() + "]";
    }
}
