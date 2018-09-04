package fr.formation.sodibank.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Country {
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	private String codeIso;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Raiting raiting;
	
	
	public Country() {
		//
	}


	public String getCodeIso() {
		return codeIso;
	}


	public void setCodeIso(String codeIso) {
		this.codeIso = codeIso;
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
		result = prime * result + ((codeIso == null) ? 0 : codeIso.hashCode());
		result = prime * result + ((raiting == null) ? 0 : raiting.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Country))
			return false;
		Country other = (Country) obj;
		if (codeIso == null) {
			if (other.codeIso != null)
				return false;
		} else if (!codeIso.equals(other.codeIso))
			return false;
		if (raiting == null) {
			if (other.raiting != null)
				return false;
		} else if (!raiting.equals(other.raiting))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Country [codeIso=" + codeIso + ", raiting=" + raiting + "]";
	}
	
	

}
