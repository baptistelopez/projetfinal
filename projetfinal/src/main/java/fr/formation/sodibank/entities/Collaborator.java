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
	
	
	@Column
	private String matricule;
	
	@Column
	private String lastname;
	
	@Column
	private String firstname;
	
	@Column
	private String email;
	
	
	
	public Collaborator(String matricule,String lastname,String firstname, String email) {
		
		setMatricule(matricule);
		setLastname(lastname);
		setLastname(firstname);
		setEmail(email);
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
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
		return "Collaborator [matricule=" + matricule + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", email=" + email + ", getMatricule()=" + getMatricule() + ", getLastname()=" + getLastname()
				+ ", getFirstname()=" + getFirstname() + ", getEmail()=" + getEmail() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
