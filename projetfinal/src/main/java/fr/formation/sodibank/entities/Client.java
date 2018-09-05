package fr.formation.sodibank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Client {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length = 50, nullable = false)
	@NotNull(message = "{error.commons.required}")
	private String code;
	
	@Column(length = 50, nullable = false)
	@NotNull(message = "{error.commons.required}")
	private String lastname;
	
	@Column(nullable = false)
	@NotNull(message = "{error.commons.required}")
	private String legalForm;
	
	@Column(length = 50, nullable = false)
	@NotNull(message = "{error.commons.required}")
	private Long accountNumber;

	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull(message = "{error.commons.required}")
	private Raiting raiting;
	
	@OneToOne
	@NotNull(message = "{error.commons.required}")
	@JoinColumn(nullable = false)
	 private User user;
	
	public Client() {
		//
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Raiting getRaiting() {
		return raiting;
	}

	public void setRaiting(Raiting raiting) {
		this.raiting = raiting;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((legalForm == null) ? 0 : legalForm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Client))
			return false;
		Client other = (Client) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (legalForm == null) {
			if (other.legalForm != null)
				return false;
		} else if (!legalForm.equals(other.legalForm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [legalForm=" + legalForm + ", accountNumber=" + accountNumber + "]";
	}
	
	

}
