/**
 * 
 */
package fr.formation.sodibank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrateur
 *
 */

@Entity
public class Collaborator {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column(length = 50, nullable = false)
	private String matricule;
	
	 @Column(length = 50, nullable = false)
	private String lastname;
	
	 @Column(length = 50, nullable = false)
	private String firstname;
	 
	 @Column(length = 50, nullable = false)
	 private User user;
		 
	
	
	
	public Collaborator(String matricule,String lastname,String firstname) {
		
		setMatricule(matricule);
		setLastname(lastname);
		setLastname(firstname);
		
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Collaborator))
			return false;
		Collaborator other = (Collaborator) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matricule == null) {
			if (other.matricule != null)
				return false;
		} else if (!matricule.equals(other.matricule))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Collaborator [id=" + id + ", matricule=" + matricule + ", lastname=" + lastname + ", firstname="
				+ firstname + ", getMatricule()=" + getMatricule() + ", getLastname()=" + getLastname()
				+ ", getFirstname()=" + getFirstname() + ", getId()=" + getId() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
	

}
